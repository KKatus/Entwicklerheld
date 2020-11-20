package Anagram_Challenge;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String firstWord, String secondWord) {
        // making sure that upper/lower case does not mess up the sorting
        firstWord = firstWord.toLowerCase();
        // converting the String to a char array
        char[] array1 = firstWord.toCharArray();
        secondWord = secondWord.toLowerCase();
        char[] array2 = secondWord.toCharArray();
        // actual sorting of the array
        Arrays.sort(array1);
        Arrays.sort(array2);
        // converting the array back to a String
        firstWord = new String(array1);
        secondWord = new String(array2);
        // checking if both strings(sorted) are the same
        if (firstWord.equals(secondWord)) {
            return true;
        } else {
            return false;
        }

    }

}