package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] splitArray = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=splitArray.length-1 ; i >= 0; i--){
            if(splitArray[i].trim().length() == 0){
                continue;
            }
            if(i==0){
                sb.append(splitArray[i].trim());
            }
            else{
                sb.append(splitArray[i].trim() + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
