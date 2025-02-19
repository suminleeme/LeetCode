import java.util.*;
import java.io.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> resultLis = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            int pos = Collections.binarySearch(resultLis, nums[i]);
            if (pos < 0) pos = -(pos + 1);

            if (pos == resultLis.size()) {
                resultLis.add(nums[i]);
            } else {
                resultLis.set(pos, nums[i]);
            }
        }

        return resultLis.size();


    }
}