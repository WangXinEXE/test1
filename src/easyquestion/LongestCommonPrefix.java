package easyquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
        String[] strs = {"flswer", "flow", "flight"};
        new LongestCommonPrefix().longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs) {
        HashSet<String> set = new HashSet<>();
        int index = 1;
        for (String str : strs) {
            set.add(str.substring(0, index));
        }
        if(set.size() != 1) {
            return "";
        }
        while (true) {
            index++;
            set.clear();
            for (String str : strs) {
                set.add(str.substring(0, index));
            }
            if(set.size() != 1) {
                break;
            }
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return null;
    }


}
