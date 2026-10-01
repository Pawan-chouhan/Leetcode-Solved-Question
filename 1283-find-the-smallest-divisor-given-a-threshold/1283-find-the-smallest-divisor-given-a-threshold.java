class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s =1;
        int e =0;
        int ans =0;
        for(int ele :nums){
            e = Math.max(e,ele);
        }
        while (s<=e){
            int mid = s+(e-s)/2;
            if (isValid(nums,mid ,threshold)){
                ans = mid;
                e = mid -1;
            }
            else s = mid+1;
        }
        return ans;

    }
    static boolean isValid(int []nums,int cp,int threshold){
        int cursum=0;
        for(int ele : nums){
            
               cursum += Math.ceil(ele*1.0/cp);
            
        
        }
        
        return cursum<=threshold;
    }
}
