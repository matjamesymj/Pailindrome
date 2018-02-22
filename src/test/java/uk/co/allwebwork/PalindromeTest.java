package uk.co.allwebwork;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PalindromeTest extends TestCase {

    public void testIsPalindromeTestTrue() throws Exception {
        Palindrome palindrome = new Palindrome();
        Assert.assertTrue(palindrome.isPalindrome("Deleveled"));
    }

    public void testIsPalindromeTestTrueMixedCase() throws Exception {
        Palindrome palindrome = new Palindrome();
        Assert.assertTrue(palindrome.isPalindrome("DeLeVeLed"));
    }

    public void testIsPalindromeTestFalse() throws Exception {
        Palindrome palindrome = new Palindrome();
        Assert.assertFalse(palindrome.isPalindrome("NotaPalindrome"));
    }


}