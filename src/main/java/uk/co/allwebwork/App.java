package uk.co.allwebwork;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String word = "Deleveled";
        Palindrome palindrome = new Palindrome();
        Boolean isPalindrome = palindrome.isPalindrome(word);
        System.out.println("Palindrome word: " + word + " = " + isPalindrome );
    }
}
