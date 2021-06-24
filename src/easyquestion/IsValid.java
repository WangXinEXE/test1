package easyquestion;

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
        String s1 = "()[]{";
        String s2 = "{[]}";
        String s3 = "(){[]}";
        CharSequence charSequence = s.subSequence(0, 2);
        System.out.println(charSequence);

    }
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        return false;



    }

}
