class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer>map = new HashMap<>();
        
        for(int ele :nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
            
        }
       for(int ele:map.keySet()){
        int freq= map.get(ele);

        if(freq>n/2)return ele ;
       }
      return -1;  
    }
}