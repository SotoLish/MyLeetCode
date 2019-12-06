package org.soto.d001;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author liuqixin
 * @date 2019/12/4 17:02
 */
public class P001_TwoNumAdd {

    public static void main(String[] args) {
        int[] ns = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(ns,target);
        if (res != null){
            System.out.println("["+res[0]+ ","+res[1] + "]");
        }else{
            System.out.println("null");
        }
    }

    /**
     * 查找变量的之和两个数的坐标
     * @param nums 查找的升序数组
     * @param target 查找变量
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        // 定义映射，以值为Key，以坐标为Value
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        // 循环
        for (int i = 0; i < nums.length; i++) {
            // 计算目标值与当前数组值的插值
            int com = target - nums[i];
            // 在map中根据差值寻找对应的Key
            if (map.containsKey(com)) {
                return new int[]{map.get(com), i};
            }
            // 将当前数组中的数字放进map中，这种做法是避免同样一个值使用两次
            // 与当前数组值计算时，map中不会存在当前数组的值
            map.put(nums[i], i);
        }
        return null;
    }
}
