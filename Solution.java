import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int lastZeroIndex = 0;

        //{0,1,0,3,12}
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i]= nums[lastZeroIndex];
                nums[lastZeroIndex] = temp;
                lastZeroIndex++;
            }
        }
    }
}