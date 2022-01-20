package mypack;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length - count; ) {
            if (nums[i] == val) {
                int k = nums.length - count - 1;
                for (int j = i; j < k; j++) {
                    nums[j] = nums[j + 1];
                }
                count++;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - count;
    }

    public static void main(String[] args) {
        int num[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(num, 2));
    }
}
