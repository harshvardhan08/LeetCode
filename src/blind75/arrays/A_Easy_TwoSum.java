package blind75.arrays;

import java.util.HashMap;
import java.util.Map;

/*

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */
public class A_Easy_TwoSum {

    // Brute Force, Time Complexity O(n^2), Space Complexity O(1)
    public int[] twoSum_Brute(int[] nums, int target) {

        int[] arr = new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }


    // Optimized, Time Complexity O(n), Space Complexity O(n)
    // Use HashMap
    public int[] twoSum_Optimize(int[] nums, int target) {

        int[] arr = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                return arr;
            }
            map.put(nums[i], i);
        }

        return arr;
    }
}
