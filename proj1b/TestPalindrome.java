import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }
    @Test
    public void testisPalindrome(){
     assertFalse(palindrome.isPalindrome("persiflage"));
     assertTrue(palindrome.isPalindrome("lol"));
     assertFalse(palindrome.isPalindrome("Lol"));
     assertTrue(palindrome.isPalindrome("l"));
     assertTrue(palindrome.isPalindrome(""));
    }
    @Test
    public void testOffByOneP(){
        CharacterComparator cc=new OffByOne();
        assertFalse(palindrome.isPalindrome("bob",cc));
        assertTrue(palindrome.isPalindrome("&o%",cc));
        assertTrue(palindrome.isPalindrome("aabb",cc));
    }
}
//Uncomment this class once you've created your Palindrome class.