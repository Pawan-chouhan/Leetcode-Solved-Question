class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map= new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>list=new ArrayList<>(map.keySet()); 
        list.sort((a,b)->map.get(b)-map.get(a));


        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}