package validParentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

	private ValidParentheses validParentheses;
	
	@BeforeEach
	void setUp() {
		validParentheses = new ValidParentheses();
	}

	@Test
	void testValidParentheses_ShouldBeReturnTrue() {
//		Given
		String s = "()";
//		When
		boolean actual = validParentheses.isValid(s);
//		Then
		boolean expected = true;
		assertEquals(expected, actual);
	}
}
