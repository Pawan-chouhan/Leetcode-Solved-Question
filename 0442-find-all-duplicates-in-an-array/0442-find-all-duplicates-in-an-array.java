class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer>list = new ArrayList<>();
        int n = arr.length;
        int i=0;
        while(i<n){
            int ci = arr[i]-1;
            if(arr[i]!=arr[ci]){ 
                int temp = arr[i];
                arr[i]=arr[ci];
                arr[ci]=temp;

            }
            else i++;
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
}