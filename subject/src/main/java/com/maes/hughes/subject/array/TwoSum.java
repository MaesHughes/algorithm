package com.maes.hughes.subject.array;

import com.alibaba.fastjson.JSON;
import com.maes.hughes.api.model.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        result[0] = -1;
//        if(nums.length <= 0){
//            return result;
//        }
//
//        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();
//        for(int i = 0;i < nums.length;i ++){
//            int currentValue = nums[i];
//
//            Integer index = numMap.get(currentValue);
//            if(index != null){
//                result[0] = index;
//                result[1] = i;
//                return result;
//            }else{
//                numMap.put(target - currentValue,i);
//            }
//        }
//
//        return result;
//    }

    public static int[] twoSum(int[] nums, int target) {
        int maxValue = 2048;
        int[] map = new int[maxValue];
        int tool = maxValue - 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int pos = map[(target - num) & tool];
            if (pos != 0) {
                return new int[]{pos - 1, i};
            }
            map[num & tool] = i + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] twoSubject = twoSum(Array.get(), 0);
        System.out.println("two subject = " + JSON.toJSONString(twoSubject));
    }
}
