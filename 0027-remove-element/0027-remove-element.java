class Solution {
    public int removeElement(int[] arr, int val) {

        int i=0;
        for(int j=0;j<arr.length;j++){
            if(val !=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
        
    }
}