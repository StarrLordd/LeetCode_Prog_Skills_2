class Solution {
    public boolean lemonadeChange(int[] bills) {
        Stack<Integer> s=new Stack<>();
        int f=0;
        int t=0;
        int tt=0;
        for(int i:bills){
            if(i==5) f++;
            else if(i==10 && f>0){
                t++;
                f--;
            }
            else if(i==20 && f>0 && t>0){
                tt++;
                t--;
                f--;
            }
            else if(i==20 && f>=3){
                tt++;
                f-=3;
            }
            else return false;
        }
        return true;
    }
}