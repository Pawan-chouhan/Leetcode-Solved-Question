class Solution {
    public int maxSubArray(int[] arr) {
        int maxsum =arr[0];
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum +=arr[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
        
    }
}