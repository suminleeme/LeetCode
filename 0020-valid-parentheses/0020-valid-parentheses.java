import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() == 1) return false;

        for (int i=0; i<s.length(); i++) {
            char input = s.charAt(i);

            if (input == '(' || input == '{' || input == '[') {
                if (i == s.length() - 1) return false;

                stack.push(input);
                continue;
            }

            if (input == ')' || input == '}' || input == ']') {
                if (i == 0 || stack.isEmpty()) return false;

                char output = stack.peek();

                if (output == '(' && input == ')'  || output == '{' && input == '}' || output == '[' && input == ']') {
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}