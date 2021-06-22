package easyquestion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class Reverse {
    public static void main(String[] args) {
        int num = 1534236474;
        int reverse = new Reverse().reverse(num);
        System.out.println(reverse);
    }
    public int reverse(int x) { //你能把任何简单的事情复杂化,这是你的天赋
        String s = "";
        String nums = x + "";
        if(x < 0) {
            String substring = nums.substring(1);
            char[] chars = substring.toCharArray();
            ArrayList<Character> list = new ArrayList<Character>();
            for (char aChar : chars) {
                list.add(aChar);
            }
            Collections.reverse(list);
            s = s + "-";
            for (Character character : list) {
                s = s + character;
            }
            try {
                int i = Integer.parseInt(s);
                return i;
            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            char[] chars = nums.toCharArray();
            ArrayList<Character> list = new ArrayList<Character>();
            for (char aChar : chars) {
                list.add(aChar);
            }
            Collections.reverse(list);
            for (Character character : list) {
                s = s + character;
            }
            try {
                int i = Integer.parseInt(s);
                return i;
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public int reverses(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

    public int reverseCopy(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }



}
