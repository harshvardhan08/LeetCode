package blind75.arrays;

import java.util.HashSet;
import java.util.Set;

/*

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


 */

public class B_Easy_ContainsDuplicate {

    //Brute force solution will be having two loops and checking i, j values, Time Complexity O(n^2), Space complexity O(1)

    //Another Solution is Sort the array, check if value of curr indx == value of nxt idex. Time Complexity is O(nlogn) space complexity is O(logn)

    //Best Solution, Time Complexity O(n), Space Complexity O(n)
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }

}
