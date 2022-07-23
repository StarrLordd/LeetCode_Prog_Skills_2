class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
           public int compare(int[] a,int[] b){
               return ((b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
           } 
        });
        for(int[] p:points){
            pq.add(p);
            if(pq.size()>k) pq.poll();
        }
        int res[][]=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            res[i]=pq.poll();
            i++;
        }
        return res;
    }
}