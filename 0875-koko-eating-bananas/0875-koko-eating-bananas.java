class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s =1;
        int e= 0;
        int ans = -1;
        for(int ele:piles){
            s= Math.min(s,ele);
            e= Math.max(e,ele);

        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(piles,h,mid)){
                ans = mid;
                e=mid-1;
            }
            else s= mid+1;

        }
          return  ans ; 
        }
        static boolean isValid (int[]piles,int hours,int cap){
            int curh=0;
            for (int ele:piles){
            curh += Math.ceil(ele*1.0/cap);

            }
            return curh<=hours;
        }
        
    }
