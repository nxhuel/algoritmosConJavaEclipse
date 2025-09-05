package longestCommonPrefix;

public class Prefix {

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		
		String prefix = strs[0];
		
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() -1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		
		return prefix;
	}
	
	public static void main(String[] args) {
		String[][] testCases = {
			{"flor", "flujo", "vuelo"}, // No common prefix
			{"flower", "flow", "flight"}, // Common prefix: "fl"
			{"dog", "racecar", "car"}, // No common prefix
			{"alone"}, // Single string
			{}, // Empty array
			{"", "abc"}, // One empty string
			{"test", "test", "test"} // All identical
		};
		
		for (String[] test : testCases) {
			System.out.println("Input: " + java.util.Arrays.toString(test));
			System.out.println("Output - Longest Common Prefix: '" + longestCommonPrefix(test) + "'\n");
		}
	}
}