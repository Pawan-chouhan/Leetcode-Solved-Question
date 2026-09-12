class Solution {
    public int trap(int[] height) {
        int ans =0;
        int n = height.length;
        int rm[]=new int [n];
        rm[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(height[i],rm[i+1]);
        }
        int leftmax= height[0];
        for(int i=1;i<n-1;i++){
            leftmax =Math.max(leftmax,height[i]);
            ans += Math.min(rm[i],leftmax)-height[i];
        }
        
       
        return ans;
    }
}