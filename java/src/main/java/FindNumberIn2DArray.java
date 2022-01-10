public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        int x_len = matrix.length;
        if (x_len == 0) {
            return false;
        }
        int y_len = matrix[0].length;
        //斜着遍历
        int i = 0;
        int j = 0;
        //action 0（右）->1（左下）->2（右）->3（右上）->0（右）
        int action=0;
        do {
           int num=matrix[i][j];
           if(num==target){
               return true;
           }else if (num>target){
               return false;
           }
           if(action==0){
               j++;
           }
        } while (i < x_len || j < y_len);
        return false;
    }
}
