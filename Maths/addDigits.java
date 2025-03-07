package Maths;

public class addDigits {
    static int addDigitsOfNum(int num) {
        int sum = 0;

        while(true){
            if(num <= 9){
                return num;
            }

            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }

            num = sum;
            sum = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigitsOfNum(38));
    }
}
