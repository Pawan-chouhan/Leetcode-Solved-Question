class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer>list = new ArrayList<>();

        for(int num:nums){
            list.add(num);
        }
        if(list.contains(target)){
            return list.indexOf(target);
       }
       for( int i=0;i<list.size();i++){
        if(list.get(i)>target){
            return i;
        }
       }
       return list.size();
        
    }
}