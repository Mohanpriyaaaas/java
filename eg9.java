class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int up=0;
        int left=0;
        int right=cols-1;
        int down=rows-1;
        while(res.size()<rows*cols){
            for(int col=left;col<=right;col++){
                res.add(matrix[up][col]);
            }
            for(int row=up+1;row<=down;row++){
                res.add(matrix[row][right]);
            }
            if(up!=down){
                for(int col=right-1;col>=left;col--){
                    res.add(matrix[down][col]);
                }
            }
            if(left!=right){
                for(int row=down-1;row>up;row--){
                    res.add(matrix[row][left]);
                }
            }
            up++;
            left++;
            right--;
            down--;
        }
        return res;
    }
}
