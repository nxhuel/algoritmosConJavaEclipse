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
	
	@DisplayName("twoSum should return correct indices [0, 1] for target 9")
	@Test
	void testTwoSum_ReturnCorrectIndices() {
//		Given
		int[] nums = {2, 7, 11, 15};
		int target = 9;
//		When
		int[] actual = twoSum.twoSum(nums, target);
//		Then
		int[] expected = {0, 1};
		assertArrayEquals(expected, actual);
	}

	@DisplayName("two sum should return null because no sum is equal to target")
	@Test
	void testTwoSum_ReturnNull() {
//		Given
		int[] nums = {3, 2, 1, 11};
		int target = 9;
//		When
		int[] actual = twoSum.twoSum(nums, target);
//		Then
		int[] expected = null;
		assertArrayEquals(expected, actual);
	}

	@DisplayName("two sum should return null because there is no array of numbers")
	@Test
	void testTwoSum_NumsVoid_ReturnNull() {
//		Given
		int[] nums = {};
		int target = 9;
//		When
		int[] actual = twoSum.twoSum(nums, target);
//		Then
		int[] expected = null;
		assertArrayEquals(expected, actual);
	}
	
	@DisplayName("two sum should return null because result < 2 is sent")
	@Test
	void testTwoSum_AnIndex_ReturnNull() {
//		Given
		int[] nums = {9};
		int target = 9;
//		When
		int[] actual = twoSum.twoSum(nums, target);
//		Then
		int[] expected = null;
		assertArrayEquals(expected, actual);
	}
	
	@DisplayName("twoSum should return correct indices [0, 3] for target 9")
	@Test
	void testTwoSumHashMap_ReturnCorrectIndices() {
//		Given
		int[] nums = {2, 11, 15, 7};
		int target = 9;
//		When
		int[] actual = twoSum.twoSumWithHashMap(nums, target);
//		Then
		int[] expected = {0, 3};
		assertArrayEquals(expected, actual);
	}

}
