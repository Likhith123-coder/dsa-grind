class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int left = 0;
        int unique = 1;
        int right = 1;

        while(right < n){
            if(nums[right] == nums[right-1]){
                right++;
                continue;
            }
            nums[left+1] = nums[right];
            left++;
            unique++;
            right++;
        }
        return unique;
    }
}