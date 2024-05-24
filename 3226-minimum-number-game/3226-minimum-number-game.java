import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i+=2) {
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}