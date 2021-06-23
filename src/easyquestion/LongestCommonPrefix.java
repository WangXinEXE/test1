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
        String[] strs = {"a","ac"};
        String[] strs1 = {"flower","flow","flight"};
        String s = new LongestCommonPrefix().longestCommonPrefix(strs1);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {//多捞啊
        HashSet<String> set = new HashSet<>();
        int index = 1;
        String res = "";
        if(strs.length == 1) {
            return strs[0];
        }
        for (String s : strs) {
            set.add(s);
        }
        if(set.size() == 1) {
            for (String s : set) {
                res = s;
            }
            return res;
        } else {
            set.clear();
        }
        try {
            for (String str : strs) {
                set.add(str.substring(0, index));
            }
        } catch (Exception e) {
            return "";
        }
        if(set.size() != 1) {
            return "";
        }
        while (true) {
            index++;
            //set.clear();
            try {
                for (String str : strs) {
                    set.add(str.substring(0, index));
                }
            } catch (Exception e) {
                for (String s : set) {
                    res = s.substring(0, s.length());
                }
                return res;
            }
            if(set.size() != 1) {
                break;
            }
        }
        for (String s : set) {
             res = s.substring(0, s.length() - 1);
        }
        return res;
    }

    public String newLngestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String s = strs[0];
        for (String str : strs) {
            while (!str.startsWith(s)) {
                s = s.substring(0,s.length() - 1);
            }
        }
        return s;
    }


}
