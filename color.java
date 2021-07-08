//Time Complexity : O(n)
//Space Complexity : O(1)
// tried on leetcode.

class Solution {
    public void sortColors(int[] nums) {
        int p0 =0;
        int current = 0;
        int p1 =nums.length - 1;
        int temp;
        while(current<=p1)
        {
            if(nums[current]==0)
            {
               temp = nums[current];
                nums[current] = nums[p0];
                nums[p0] = temp;
                p0++;
                current++;
            }
            else if(nums[current]==2)
            {
                temp = nums[current];
                nums[current] = nums[p1];
                nums[p1] = temp;
                p1--;
            }
            else
                current++;
        }
}
}