package Maths;

public class countEven {
    static int countEvenNums(int num) {
        int digitSum = 0, temp = num;

        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        return (digitSum % 2 == 0) ? num / 2 : (num - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(countEvenNums(51));
    }
}
