class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            } 
        }
        
        
        return arr;
        
    }
}