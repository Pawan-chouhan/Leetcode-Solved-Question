class Solution {
    public int[] sortedSquares(int[] arr) {
        
        int temp[]=new int [arr.length];
        int i = 0;
        int j = arr.length-1;
        int k = temp.length-1;
        while(k>=0){
            if(Math.abs(arr[i])<Math.abs(arr[j])){
                temp[k--]= arr[j]*arr[j--];
            } else temp[k--]=arr[i]*arr[i++];
        }
        return temp;
    }
}