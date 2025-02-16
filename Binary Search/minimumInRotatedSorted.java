public class minimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,0};

        int minElement = Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low + high) / 2;

            if(minElement > arr[mid]){
                minElement = arr[mid];
            }

            if(arr[mid] > arr[high]){
                low = mid + 1;
            }
            else{
                high  = mid -1;
            }
        }

        System.out.println(minElement);
    }
}
