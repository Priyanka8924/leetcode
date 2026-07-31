import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long max = 0;
        long sum = 0;

        int i = 0;
        int j = 0;

        HashSet<Integer> set = new HashSet<>();

        while (j < nums.length) {

            // if current element is not duplicate
            if (!set.contains(nums[j])) {

                set.add(nums[j]);
                sum += nums[j];

                // window size less than k
                if (j - i + 1 < k) {
                    j++;
                }

                // window size equal to k
                else if (j - i + 1 == k) {

                    max = Math.max(max, sum);

                    // remove left element and slide
                    set.remove(nums[i]);
                    sum -= nums[i];

                    i++;
                    j++;
                }

            } 
            // duplicate found
            else {

                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return max;
    }
}