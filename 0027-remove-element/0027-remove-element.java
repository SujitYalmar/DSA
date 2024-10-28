class Solution {
    public int removeElement(int[] nums, int val){
        int newLength = 0; 
        for (int num : nums) {
            if (num != val) {
                nums[newLength++] = num;
            }
        }
        return newLength; 
    }
}
