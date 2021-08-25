package mediumquestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeQuestion {
    public static void main(String[] args) {
        int[] arrs = {4, 2, 0, -2, 5, -3, 1, 7, -8};
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (true) {

            if (arrs[i] + arrs[i + 1] + arrs[i + 2] == 0) {
                list.add(arrs[i]);
                list.add(arrs[i + 1]);
                list.add(arrs[i + 2]);
                lists.add(list);
                list.clear();
                i++;
            }


        }

    }

    public List<List<Integer>> threeSum(int[] nums) {

        return null;
    }
}
