package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i =0; i <nums.length; i++){
                int complete = target - nums[i];
                if(map.containsKey(complete)){
                    return new int[]{map.get(complete), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args)
    {
       int[] nums = new int[]{3,3};
       int b=6;
       System.out.println(Arrays.toString(twoSum(nums,b)));
    }
}
