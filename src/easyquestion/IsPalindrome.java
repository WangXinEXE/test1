package easyquestion;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int x = 0;
        boolean palindrome = new IsPalindrome().isPalindrome(x);
        System.out.println(palindrome);
    }
    public boolean isPalindrome(int x) {
        int b = 0;
        int temp = x;
        if(x < 0) {
            return false;
        } else {
            while (x != 0) {
                b = b * 10 + x % 10;
                x = x / 10;
            }
            if(temp == b) {
                return true;
            } else {
                return false;
            }
        }
    }
}
