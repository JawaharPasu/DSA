package dataStructures.hashFunctions;

public class HashFunction {

    public static Integer hash(String word, Integer arrayLength) {
        Integer total=0;
        Integer length = word.length();
        char[] characters = word.toCharArray();
        for(int i=0; i< Math.min(length, 100); i++) {
            total = (total*31 +(int) characters[i]) % arrayLength;
//            System.out.println(total);
        }
        return total;
    }
}
