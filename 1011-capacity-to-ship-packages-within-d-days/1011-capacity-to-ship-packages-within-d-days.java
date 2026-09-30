class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        int e=0;
        int ans = 0;
        for (int ele :weights){
             s = Math.max (s ,ele);
            e += ele;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if (isValid(weights,mid,days)){
                ans =mid;
            e = mid-1;
            }
            else s= mid+1;
        }
        return ans ;
    }
    static boolean isValid(int []weights,int cap,int days){
        int curntw=0;
        int curntd=1;

        for (int ele:weights){
            if(curntw+ele<=cap){
                
                curntw+=ele ;
            }
            else {
                curntd++;
                 curntw =ele;
                if(curntd>days){
                    return false;
                }
               
            }
        }
        return true;
    }
}