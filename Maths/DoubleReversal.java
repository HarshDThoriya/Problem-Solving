package Maths;

public class DoubleReversal {
    static boolean isSameAfterReversals(int num) {
        

        if(num == 0){
            return true;
        }
        else if(num % 10 == 0){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(180));
    }
}
