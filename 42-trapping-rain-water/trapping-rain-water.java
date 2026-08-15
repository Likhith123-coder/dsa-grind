class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        int left = 0;
        int right = n-1;

        int leftMax = height[0];
        int rightMax = height[n-1];

        while(left < right){
            if(leftMax < rightMax){
                left++;

                leftMax = Math.max(leftMax,height[left]);
                    totalWater += leftMax - height[left];
            }
            else{
                right--;

                rightMax = Math.max(rightMax,height[right]);
                   totalWater += rightMax - height[right];

            }
        } 
        return totalWater;
    }
}