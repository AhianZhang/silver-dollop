package algorihtm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-17 10:07
 **/
public class ValidParentheses {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
    }


}

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } else if (map.containsValue(c)) {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}