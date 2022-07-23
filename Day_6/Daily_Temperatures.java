// class Solution {
//     public int[] dailyTemperatures(int[] temp) {
//         int arr[]=new int[temp.length];
//         for(int i=0;i<temp.length;i++){
//             int t=0;
//             for(int j=i+1;j<temp.length;j++){
//                 if(temp[j]>temp[i]) {t=j-i;break;}
//             }
//             arr[i]=t;
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s=new Stack<>();
        int res[]=new int[temp.length];
        for(int i=temp.length-1;i>=0;i--){
            if(s.empty()) {
                s.push(i);
                res[i]=0;
            }
            else{
                while(!s.empty() && temp[s.peek()]<=temp[i]){
                    s.pop();
                }
                if(s.empty()) {
                s.push(i);
                res[i]=0;
                }
                else{
                    res[i]=s.peek()-i;
                    s.push(i);
                }
            }
        }
        return res;
    }
}