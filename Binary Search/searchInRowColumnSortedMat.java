public class searchInRowColumnSortedMat {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;

        int m = matrix[0].length - 1;
        int n = 0;

        while(m>=0 &&  n<matrix.length){
            if(matrix[n][m] == target){
                System.out.println(true);
                System.exit(0);
            }
            if(matrix[n][m] > target ){
                m--;
            }
            else{
                n++;
            }
        }

        System.out.println(false);
    }
}
