package Maths;

public class excelColumnTitle {
    static String convertToTitle(int columnNumber) {
        String str = "";

        while(columnNumber > 0){
            columnNumber--;

            str = Character.toString('A' + (columnNumber % 26)) + str;
            columnNumber /= 26;
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}
