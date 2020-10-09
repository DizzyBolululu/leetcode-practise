import java.util.ArrayList;

/**
 * This file is practise of mine from LeetCode.
 */

public class EasyArray {

    // # 169 Majority Element: Given an Array of size n.
    // boyer more 摩尔投票法
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int n=0;n<nums.length;n++){
            if(nums[n] == candidate){
                count = count + 1;
            }else if(count>0){
                count = count - 1;
            }else{
                candidate = nums[n];
                count =1;
            }
        }
        return candidate;
    }

    public static void main(String[] args){
        EasyArray easyArray = new EasyArray();
        int[] test = new int[]{3, 2, 3, 2, 2};
        System.out.println(easyArray.majorityElement(test));
    }
}
