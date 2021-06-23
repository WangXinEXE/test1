package easyquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串""。
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
        HashSet<String> set = new HashSet<>();
        for (String str : strs) {
            set.add(str.substring(0,1));
        }
        if(set.size() == 1) {
            for (String s : set) {
                System.out.println(s);
            }
        }
    }

    public String longestCommonPrefix(String[] strs) {
        return null;

    }


}
