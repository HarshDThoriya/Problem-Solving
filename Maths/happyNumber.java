package Maths;

public class happyNumber {
    static boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
            return isHappy(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
