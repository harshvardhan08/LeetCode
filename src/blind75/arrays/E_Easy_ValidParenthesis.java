package blind75.arrays;

/*
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

import java.util.Stack;

public class E_Easy_ValidParenthesis {
    public boolean isValid(String s) {

        //Use Stack if open bracket matches push the closing bracket to stack.
        // when closing bracket cond is evaluated do pop on stack and comapre with closing bracket value, if doesnt match then return true

        //Time Complexity is O(n)
        // Space complexity O(n)

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char currIdxVal = s.charAt(i);
            if(currIdxVal == '('){
                stack.push(')');
            } else if(currIdxVal == '['){
                stack.push(']');
            } else if(currIdxVal == '{'){
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop() != currIdxVal){
                return false;
            }
        }

        return stack.isEmpty();
    }


}
