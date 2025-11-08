package org.example;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        int[] nums = {1,2,3,1};
        int[] nums = {1,2,3,4};

        boolean result = containsDuplicate(nums);
        System.out.println(result);

    }
    static boolean containsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();

        for (int num: nums){
            if (seen.contains(num)){
                return true;
            }
        }

        return false;
    }
}
