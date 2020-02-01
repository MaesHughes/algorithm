package com.maes.hughes.subject.array;

import com.alibaba.fastjson.JSON;
import com.maes.hughes.api.model.Array;

/**
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 *
 * 示例 1:
 *
 * 输入: [4,2,3]
 * 输出: True
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * 示例 2:
 *
 * 输入: [4,2,1]
 * 输出: False
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 * 说明:  n 的范围为 [1, 10,000]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/non-decreasing-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CheckPossibility {

    public static boolean checkPossibility(int[] nums) {
        if(nums.length <= 0){
            return false;
        }

        int wrongNum = 0;
        for(int i = 0;i < nums.length;i ++){
            if(i == nums.length - 1){
                continue;
            }
            if(nums[i] <= nums[i + 1]) {
                continue;
            }
            int tmp = nums[i];
            if(i >= 1) {
                nums[i] = nums[i - 1];
            } else {
                nums[i] = nums[i + 1];
            }
            if(nums[i] > nums[i + 1]) {
                nums[i] = tmp;
                nums[i + 1] = nums[i];
            }
            wrongNum++;
            if(wrongNum == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,3};
//        int[] arr = {1,2,3,4};
        System.out.println("result = " + JSON.toJSONString(checkPossibility(arr)));
    }

}