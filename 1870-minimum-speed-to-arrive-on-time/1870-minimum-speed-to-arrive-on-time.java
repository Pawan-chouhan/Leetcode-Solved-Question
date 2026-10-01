class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
       

        int s =1;
        int e=10000000;
        int ans =-1;
        
        while (s<=e){
            int mid = s+(e-s)/2;
            if(isValid(dist,mid,hour)){
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
       return ans ; 
    }
    static boolean isValid(int []dist,int speed,double hour){
         int n = dist.length;
        double sum=0;
        for(int i=0;i<n-1;i++){
            sum +=Math.ceil(dist[i]*1.0/speed);}
              sum += dist[n - 1] * 1.0 / speed;
        if(sum>hour){
            return false;
        }
        
       
        return true;
    }
}