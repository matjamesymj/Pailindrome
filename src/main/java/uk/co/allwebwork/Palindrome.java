package uk.co.allwebwork;

public class Palindrome {

    public Boolean isPalindrome(String word) {
        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(word.toLowerCase());
        String wordInReverse = stringBuilder.reverse().toString();
        return word.equals(wordInReverse);
    }
}
