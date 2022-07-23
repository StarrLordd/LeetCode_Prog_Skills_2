class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst=new ArrayList<>();
        int left=0,top=0,bottom=matrix.length-1,right=matrix[0].length-1,dir=0;
        while(top<=bottom&&left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++) lst.add(matrix[top][i]);
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=bottom;i++) lst.add(matrix[i][right]);
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--) lst.add(matrix[bottom][i]);
                bottom--;
            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--) lst.add(matrix[i][left]);
                left++;
            }
            
            dir=(dir+1)%4;
        }
        return lst;
        
    }
}