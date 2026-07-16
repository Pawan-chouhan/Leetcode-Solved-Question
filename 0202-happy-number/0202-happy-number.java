
class Solution {
    public boolean isHappy(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int sum=0;
            while(n>0){
                int dig = n%10;
                sum += dig*dig;
               n /=10;
                
                
            }
            if(sum==1){
                return true;
            }else if(list.contains(sum)) return false;
            list.add(sum);
            n=sum;
           
            
        }
        
    }
}