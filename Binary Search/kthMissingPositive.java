public class kthMissingPositive {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,7,13};

        int k = 5;

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(left + k);
    }
}
