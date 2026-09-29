class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
                int ans  =-1;

        if(bloomDay.length<m*k)return -1;
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        for(int ele:bloomDay){
            s= Math.min(s,ele);
            e= Math.max(e,ele);
        }
    while(s<=e){
        int mid = s+(e-s)/2;
        if(isValid(bloomDay,mid,k,m)){
            ans = mid;
            e =mid-1;
        }
        else s = mid+1;
    }
      return ans ;  
    }
    static boolean isValid(int []bloomday ,int day,int k,int m){
        int count = 0;
        int ans =0;
        for(int ele :bloomday){
            if(ele<=day){
                count ++;
            }
            else {
                ans +=count/k;
                count=0;

            }

        }
        ans +=count/k;
    return ans >=m;
}}