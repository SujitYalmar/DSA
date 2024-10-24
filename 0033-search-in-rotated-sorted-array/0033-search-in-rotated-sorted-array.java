class Solution {
    public int search(int[] nums, int target) {
        int arrayLength = nums.length;
      
        int start = 0, end = arrayLength - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[arrayLength - 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return nums[start] == target ? start : -1;
    }
  
}

