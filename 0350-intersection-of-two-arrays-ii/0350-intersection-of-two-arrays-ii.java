class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map= new HashMap<>();
        for(int ele:nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer>list= new ArrayList<>();
        for(int ele :nums2){
            if(map.containsKey(ele)&&map.get(ele)>0){
                list.add(ele);
                map.put(ele,map.get(ele)-1);
            }
        }
        int[] ans= new int [list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
       return ans ; 
    }
}