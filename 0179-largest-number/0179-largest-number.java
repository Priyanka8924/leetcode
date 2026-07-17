class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // Convert int array to String array
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        
// Edge case: [0,0]
        if (arr[0].equals("0")) {
            return "0";
        }
        // Convert array to String
        StringBuilder ans = new StringBuilder();

        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}