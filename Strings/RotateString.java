package Strings;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

        if (s.length() != goal.length()) {
            System.out.println("False");
        }

        System.out.println((s + s).contains(goal));
    }
}
