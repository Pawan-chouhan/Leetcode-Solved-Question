class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int num : digits){
            list.add(num);
        }
    for(int i=list.size()-1;i>=0;i--){
        if(list.get(i)<9){
            list.set(i,list.get(i)+1);
            break;
        }
        else{
            list.set(i,0);
        }
        if(list.get(0)==0){
            list.add(0,1);
        }}
        int []ans= new int [list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);

        }
        return ans;
    }
}