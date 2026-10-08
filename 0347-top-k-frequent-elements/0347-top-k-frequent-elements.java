// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer,Integer>map= new HashMap<>();
//         for(int ele:nums){
//             map.put(ele,map.getOrDefault(ele,0)+1);
//         }
//         List<Integer>list= new ArrayList<>();
        
//         for(int ele:map.keySet()){
//             int freq=map.get(ele);
//             if(freq>=1&&k>list.size()){
                
                
//               list.add(ele);
//             }
         
//         }
//           int ans[] = new int[list.size()];
//             for(int i=0;i<list.size();i++){
//                 ans [i]=list.get(i);
//             }
         
//         return ans;

//     }
// }
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Store all elements
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort according to frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Create answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}