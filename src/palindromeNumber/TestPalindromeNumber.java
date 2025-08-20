package palindromeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestPalindromeNumber {
	private PalindromeNumber palindromeNumber;
	
	@BeforeEach
	void setUp() {
		palindromeNumber = new PalindromeNumber();
	}

	@DisplayName("isPalindrome should return true")
	@Test
	void testIsPalindrome_ReturnTrue() {
//		Given
		int x = 101;
		
//		When
		boolean actual = palindromeNumber.isPalindrome(x);
//		Then
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@DisplayName("isPalindrome should return false")
	@Test
	void testIsPalindrome_ReturnFalse() {
//		Given
		int x = 2417892;
		
//		When
		boolean actual = palindromeNumber.isPalindrome(x);
		
//		Then
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
