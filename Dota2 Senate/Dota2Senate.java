import java.util.*;

public class Dota2Senate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senate = sc.nextLine();

        Queue<Character> que= new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            que.add(senate.charAt(i));
            
        }
        int r=0;
        int d=0;
        while(que.size()>1){
            char ch=que.poll();
            if(ch=='R' && d>0){
                d--;
                continue;
            }else if(ch=='R' && d==0){
                r++;
                que.add(ch);
            }
            if(ch=='D' && r>0){
                r--;
                continue;
            }else if(ch=='D' && r==0){
                d++;
                que.add(ch);
            }
            if(r==que.size()){
                break;
            }
            if(d==que.size()){
                break;
            }
        }
        if(que.peek()=='R'){
            System.out.println("Radiant");
        }else{
            System.out.println("Dire");
        }
    }
}
