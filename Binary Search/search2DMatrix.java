public class search2DMatrix {
    
    static boolean searchArr(int[] row, int target){
        int low = 0;
        int high = row.length - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(row[mid] == target){
                return true;
            }
            else if(row[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        int target = 3;
        int matrix[][] = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        for(int i=0; i<matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]){
                System.out.println(searchArr(matrix[i], target));
                System.exit(0);
            }
        }

        System.out.println("false");
    }
}
