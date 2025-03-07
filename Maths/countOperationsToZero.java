package Maths;

public class countOperationsToZero {
    static int countOperations(int num1, int num2) {

        if(num1 == 0 || num2 == 0){
            return 0;
        }

        if(num1 == num2){
            return 1;
        }
        int count = 0;
        
        while(num1 != 0 && num2 != 0){
            if(num1 > num2){
                count += num1 / num2;
                num1 = num1 % num2;
            }
            else if(num2 > num1){
                count += num2/num1;
                num2 = num2 % num1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 19;
        int m = 2;

        System.out.println(countOperations(n, m));
    }
}
