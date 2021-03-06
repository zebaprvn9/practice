package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            for(int j = i + 1; j < l; j++) {
                for(int k = j + 1; k < l; k++) {
                    if(nums[i] + nums [j]  + nums[k] == 0) {
                        List<Integer> rl = new ArrayList();
                        rl.add(nums[i]);
                        rl.add(nums[j]);
                        rl.add(nums[k]);
                        if(!result.contains(rl)) {
                            result.add(rl);
                        }

                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}