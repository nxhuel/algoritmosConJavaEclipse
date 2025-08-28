package romanToInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {
	private RomanToInteger romanToInteger;

	@BeforeEach
	void setUp() {
		romanToInteger = new RomanToInteger();
	}

	@DisplayName("romanToInt should be return number 4 ")
	@Test
	void testRomanToInteger_ReturnCorrectParseRomanToInt() {
//		given
		String s = "IV";
//		when
		int actual = romanToInteger.romanToInt(s);
//		then
		int expected = 4;
		assertEquals(expected, actual);
	}

	@DisplayName("romanToInt should be return number 4 ")
	@Test
	void testRomanToInteger_ReturnCorrectParseRomanToIntMoreConvertToUpperCase() {
//		given
		String s = "iv";
//		when
		int actual = romanToInteger.romanToInt(s);
//		then
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	@DisplayName("romanToInt should be illegalArgumentException('Carácter romano inválido: A') because 'A' is not numsRomano's pk")
	@Test
	void testRomanToInteger_ReturnIllegalArgumentException() {
//		given
		String s = "AX";
//		when
        IllegalArgumentException actualException = assertThrows(
                IllegalArgumentException.class,
                () -> romanToInteger.romanToInt(s)
        );
//		then
	    String expected = "Carácter romano inválido: A";
		assertEquals(expected, actualException.getMessage());
	}
}
