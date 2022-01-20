package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            for(int j = i + 1; j < l; j++) {
                for(int k = j + 1; k < l; k++) {
                    for(int m = k + 1; m < l; m++) {
                        if(nums[i] + nums [j]  + nums[k]+ nums[m] == target) {
                            List<Integer> rl = new ArrayList();
                            rl.add(nums[i]);
                            rl.add(nums[j]);
                            rl.add(nums[k]);
                            rl.add(nums[m]);
                            if(!result.contains(rl)) {
                                result.add(rl);
                            }

                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        System.out.println(fourSum(arr, 0));

    }
}