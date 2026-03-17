package com.zzz;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(target - nums[i]) ){
                return new int[]{i,map.get(target - nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
public class aptest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3};
        int[] ret = new int[]{};
        Solution solution = new Solution();
        ret = solution.twoSum(arr,3);
        for(int x : ret){
            System.out.println(ret[x]);
        }
    }
}
