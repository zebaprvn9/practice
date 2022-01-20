package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        int count = 0;
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            int k = nums.length - count - 1;
            for(int j=i;j<k;j++) {
                count++;
                if(nums[i] + nums [j]  + nums[j-1] == 0 && j-1 >= 0) {
                    List<Integer> rl = new ArrayList();
                    rl.add(nums[i]);
                    a          rl.add(nums[j]);
                    rl.add(nums[j-1]);
                    if(!result.contains(rl)) {
                        result.add(rl);
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