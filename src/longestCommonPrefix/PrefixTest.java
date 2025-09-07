package longestCommonPrefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrefixTest {
	private Prefix prefix;

	@BeforeEach
	void setUp() {
		prefix = new Prefix();
	}

	@DisplayName("longestCommonPrefix should be return empty because not common prefix")
	@Test
	void testLongestCommonPrefix_OutputEmpty() {
//		Given
		String[] strs = {"flor", "flujo", "vuelo"};
//		When
		String actual = prefix.longestCommonPrefix(strs);
//		Then
		String expected = "";
		assertEquals(expected, actual);
	}
	
	@DisplayName("longestCommonPrefix should be return unique string 'alone'")
	@Test
	void testLongestCommonPrefix_OutputStringAlone() {
//		Given
		String[] strs = {"alone"};
//		When
		String actual = prefix.longestCommonPrefix(strs);
//		Then
		String expected = "alone";
		assertEquals(expected, actual);
	}
	
	@DisplayName("longestCommonPrefix should be return 'fl' because common prefix")
	@Test
	void testLongestCommonPrefix_OutputStringFl() {
//		Given
		String[] strs = {"flower", "flow", "flight"};
//		When
		String actual = prefix.longestCommonPrefix(strs);
//		Then
		String expected = "fl";
		assertEquals(expected, actual);
	}
}
