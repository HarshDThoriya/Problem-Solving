public class rowWithMaxOnes {

    static int findNumberOfOnes(int[] row){
        int low = 0;
        int high = row.length - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(row[mid] == 1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return row.length - low;
    }

    public static void main(String[] args) {

        int matrix[][] = new int[][]{{0,1,1,1},{0,0,1,1},{0,0,1,1}};
        int maxOnes = Integer.MIN_VALUE; 
        int row = -1;

        for(int i=0; i<matrix.length; i++){
            int temp = findNumberOfOnes(matrix[i]);
            if(temp > maxOnes){
                maxOnes = temp;
                row = i;
            }
        }
        System.out.println(row);
    }
}
