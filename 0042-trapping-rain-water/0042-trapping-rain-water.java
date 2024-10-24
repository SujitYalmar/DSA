class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //calculate leftmax
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //calculate right max
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += waterlevel-height[i];         
        }
        return trappedwater;
    }
}
