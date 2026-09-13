class NumArray {

    private int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];

        int i = 1;
        while (i < n) {
            prefix[i] = prefix[i - 1] + nums[i];
            i++;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}