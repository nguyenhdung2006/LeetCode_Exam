package Easy;

import java.util.Arrays;

public class LC27 {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        // Input giống LeetCode
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        // Expected giống LeetCode
        int[] expectedNums = { 2, 2 };

        // Gọi hàm
        int k = removeElement(nums, val);

        // Check độ dài
        System.out.println("k = " + k);

        // Sort k phần tử đầu (đúng như pseudo-code LeetCode)
        Arrays.sort(nums, 0, k);

        // In k phần tử đầu (thứ LeetCode ngầm so sánh)
        System.out.print("Output: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // So với expected
        System.out.println("Expected: " + Arrays.toString(expectedNums));
    }
}
