package PrefixSum;

public class SumOfOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};

        int result = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            int end = i+1;
            int start = n - i;
            int total = start * end;

            int odd = total / 2;

            if(total % 2  == 1){
                odd++;
            }

            result += odd*arr[i];
        }

        System.out.println(result);
    }
}
