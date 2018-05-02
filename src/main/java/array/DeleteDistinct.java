package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 示例1
 给定数组 nums = [1,1,2],
 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 你不需要考虑数组中超出新长度后面的元素。

 示例 2:
 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 你不需要考虑数组中超出新长度后面的元素。
 */
public class DeleteDistinct {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> num = new HashSet<Integer>();
        for (int n : nums) {
            num.add(n);
        }
        Object[] result = num.toArray();
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            nums[i] = Integer.parseInt(result[i].toString());
        }
        System.out.println(Arrays.toString(nums));
        return num.size();
    }

    /**
     * 高分
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-3, -1, 0, 0, 0, 3, 3};
        int len = removeDuplicates2(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
