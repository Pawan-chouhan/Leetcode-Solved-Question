class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 1;

        for (int j = 0; j < nums.length; j += 2) {

            if (nums[j] % 2 == 1) {

                while (nums[i] % 2 == 1) {
                    i += 2;
                }

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }
}