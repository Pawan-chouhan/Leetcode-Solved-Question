class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int j=1;
        while(i<arr.length-1){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i+1];
                j++;
            }i++;
        }
        return j;
    }
}