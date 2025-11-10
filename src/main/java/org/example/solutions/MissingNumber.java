package org.example.solutions;

import java.util.Arrays;

public class MissingNumber {


    private int[] nums;

    public MissingNumber(int[] nums) {
        this.nums = nums;
    }


    public int solution1(){
        // 3, 0 ,1
        int result = 0;
        Arrays.sort(this.nums);

        for (int i = 0; i < this.nums.length; i++) {
            if (result == this.nums[i]){
                result++;
            }
        }
        return result;
    }
}
