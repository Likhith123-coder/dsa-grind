class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int nums1[] = new int[n];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums1[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums1[i];
        }
    }
}