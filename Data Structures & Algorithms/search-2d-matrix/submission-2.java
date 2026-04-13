class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st = 0;
        int dr = matrix.length - 1;
        int line = -1;
        
        while(st<=dr) {
            int mij = (st+dr)/2;
            int clmn = matrix[mij].length-1;
            if(target == matrix[mij][clmn]) {
                return true;
            }else if(target > matrix[mij][clmn]) {
                st = mij+1;
            }else if(target < matrix[mij][clmn]) {
                if(target >= matrix[mij][0]) {
                    line = mij;
                    break;
                }else {
                    dr = mij-1;
                }
            }
        }

        if (line == -1) return false;
        st = 0;
        dr = matrix[line].length - 1;
        
        while(st<=dr) {
            int mij = (st+dr)/2;
            if(target == matrix[line][mij]) {
                return true;
            }else if(target > matrix[line][mij]) {
                st = mij+1;
            }else if(target < matrix[line][mij]) {
                dr = mij-1;
            }
        }

        return false;
    }
}
