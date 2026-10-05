class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map= new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int sum=0;
        boolean IsOdd= false;
        for(int freq:map.values()){
        if( freq%2==0){
            sum+=freq;
        }
        else {
            sum +=(freq-1);
            IsOdd = true;
        }}
            return IsOdd ?sum+1 :sum;

    }
}