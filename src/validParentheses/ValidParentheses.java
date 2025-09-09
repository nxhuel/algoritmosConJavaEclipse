package validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();

        for (char c : characters) {
            if (map.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop(); 
                if (top != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
