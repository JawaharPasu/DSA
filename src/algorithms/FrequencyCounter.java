package algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FrequencyCounter {

    public static <T> boolean checkFrequency(List<T> a, List<T> b) {
        if (a.isEmpty() || b.isEmpty() || a.size() != b.size()) return false;
        Map<T, Long> freqA = a.stream()
                .collect(Collectors
                        .groupingByConcurrent(Function.identity(),
                                Collectors.counting()));
        Map<T, Long> freqB = new HashMap<>();
        for (T t:b) {
            freqB.put(t, freqB.containsKey(t) ? freqB.get(t)+1 : 1);
        }
        System.out.println(freqA);
        System.out.println(freqB);
        for (Map.Entry<T, Long> entry: freqA.entrySet()) {
            if (!freqB.containsKey(entry.getKey())) return false;
            if (!entry.getValue().equals(freqB.get(entry.getKey()))) return false;
        }
        return true;
    }

    public static boolean anagramCheck(String a, String b) {
        List<Character> aList = a.chars().mapToObj(e -> (char) e).collect(toList());
        List<Character> bList = b.chars().mapToObj(e -> (char) e).collect(toList());
        return checkFrequency(aList, bList);
    }
}
