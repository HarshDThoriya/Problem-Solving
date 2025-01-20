package PrefixSum;

public class FindTheMiddleIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{1,-1,4};

        int[] rightFix = new int[arr.length];
        rightFix[arr.length - 1] = 0;
        for(int i=arr.length-2; i >= 0; i--){
            rightFix[i] = rightFix[i+1] + arr[i+1];
        }

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(sum == rightFix[i]){
                System.out.println(i);
                System.exit(0);
            }
            sum += arr[i];
        }
    }
}
