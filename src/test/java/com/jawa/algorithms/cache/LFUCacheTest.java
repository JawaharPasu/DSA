package com.jawa.algorithms.cache;

import org.junit.jupiter.api.Test;

public class LFUCacheTest {

    @Test
    public void test() {
        LFUCache cache = new LFUCache(3);
        cache.put(1,3);
        cache.put(2,5);
        cache.put(3,7);

        System.out.println(cache);

        cache.get(2);
        System.out.println(cache);
        cache.get(3);
        System.out.println(cache);
        cache.put(4,9);
        System.out.println(cache);
    }
}
