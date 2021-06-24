package easyquestion;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 输入：s = "()"
 * 输出：true
 * 输入：s = "()[]{}"
 * 输出：true
 * 输入：s = "(]"
 * 输出：false
 * 输入：s = "([)]"
 * 输出：false
 * 输入：s = "{[]}"
 * 输出：true
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 */
public class IsValid {
    public static void main(String[] args) {
        String s = "()[]{}";
        String s1 = "()[{";
        String s2 = "{[]}";
        String s3 = "(){[]}";
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < s.length(); i += 2) {
//            String s4 = s.substring(i, i + 2);
//            list.add(s4);
//        }
        boolean valid = new IsValid().isValid(s1);
        System.out.println(valid);


    }

    public boolean isValid(String s) {  //利用栈的先进后出结构进行判断,很巧妙
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '{') {
                stack.push('}');
            } else if(c == '[') {
                stack.push(']');
            } else if(stack.isEmpty() || c != stack.pop() ) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
