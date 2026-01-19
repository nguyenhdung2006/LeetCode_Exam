package Easy;

import java.util.Arrays;

public class LC01 {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println("hello");
        int[] a = { 1, 2, 3 };
        System.out.println(Arrays.toString(twoSum(a, 3)));
    }
}
