package com.jawa.algorithms.consistentHashing;

import com.jawa.algorithms.consistenthashing.ConsistentHashing;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

public class ConsistentHashingTest {

    @Test
    public void testHash() throws NoSuchAlgorithmException {
        ConsistentHashing consistentHashing = new ConsistentHashing(3);
        System.out.println(consistentHashing.generateHash("Jawahar"));
    }
}
