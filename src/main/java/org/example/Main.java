package org.example;

import org.example.solutions.ContainsDuplicate;
import org.example.solutions.ContainsNearbyDuplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static void main() {
        // Solutions
        // int[] nums = {1,2,3,4,1,23,4};
        // ContainsDuplicate currentSolution = new ContainsDuplicate(nums);

        // int [] nums = {1,2,3,1};
        int [] nums = {1,2,3,1,2,3};
        int k = 3;
        ContainsNearbyDuplicate currentSolution = new ContainsNearbyDuplicate(nums, k);


        // Check results
        HashMap<String, Boolean> results = new HashMap<String, Boolean>();
        results.put("solution1", currentSolution.solution1());
        //results.put("solution2", currentSolution.solution1());
        //results.put("solution3", currentSolution.solution1());
        //results.put("solution4", currentSolution.solution1());
        for(Map.Entry<String, Boolean> entry: results.entrySet()){
            String key = entry.getKey();
            boolean value = entry.getValue();
            IO.println("KEY: " + key + " VALUE: " + value);
        }

    }
}
