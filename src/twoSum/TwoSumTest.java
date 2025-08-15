package twoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoSumTest {
	private TwoSum twoSum;

	@BeforeEach
	void setUp() {
		twoSum = new TwoSum();
	}
	
	@DisplayName("Test Green")
	@Test
	void test() {
//		Given
		int[] nums = {2, 7, 11, 15};
		int target = 9;
//		When
		int[] actual = twoSum.twoSum(nums, target);
//		Then
		int[] expected = {0, 1};
		assertArrayEquals(expected, actual);
	}

}
