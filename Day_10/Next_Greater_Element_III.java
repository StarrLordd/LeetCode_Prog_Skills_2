class Solution {
    public int nextGreaterElement(int num) {
        long n=num;
        int arr[]=new int[10];
        int curRem=-1;
        int prevRem=-1;
        
        while(n>0){
            curRem=(int)n%10;
            n/=10;
            arr[curRem]++;
            if(prevRem>curRem){
                int m=curRem+1;
                while(arr[m]==0) m++;
                arr[m]--;
                n*=10+m;
                for(int i=0;i<10;i++)
                    while(arr[i]-->0)
                        n=n*10+i;
                return n>Integer.MAX_VALUE?-1:(int)n;
            }
            prevRem=curRem;
        }
        return -1;
    }
}