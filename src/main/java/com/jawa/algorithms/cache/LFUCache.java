package com.jawa.algorithms.cache;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCache {
    int capacity;
    int count;
    private Map<Integer, Integer> cache = new LinkedHashMap<>();
    private LinkedList<Integer> list = new LinkedList<>();

    public LFUCache(int capacity) {
        this.capacity=capacity;
    }

    public void put(int key, int value) {
        if (count<capacity) {
            if (!list.contains(key)) {
                list.offerFirst(key);
                cache.put(key, value);
                count++;
            }
            else {
                cache.put(key,value);
                list.remove(list.indexOf(key));
                list.offerFirst(key);
            }
        } else {
            if (list.contains(key)) {
                cache.put(key,value);
                list.remove(list.indexOf(key));
                list.offerFirst(key);
            } else {
                int keyl = list.pollLast();
                cache.remove(keyl);
                list.offerFirst(key);
                cache.put(key, value);
            }
        }
    }

    public int get(int key) {
        if (!list.contains(key)) return -1;
        else {
            list.remove(list.indexOf(key));
            list.offerFirst(key);
            return cache.get(key);
        }
    }

    @Override
    public String toString() {
        return "LFUCache{" +
                "list=" + list +
                '}';
    }
}
