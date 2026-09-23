class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>=arr[s]){
                if(arr[mid]>target&&arr[s]<=target)e= mid-1;
                else s= mid+1;
            }
        else{
            if(arr[mid]<=target&&arr[e]>=target) s= mid+1;
            else e = mid-1;
        }
        
        }
        return -1;
    }
}