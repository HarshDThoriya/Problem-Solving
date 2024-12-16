import java.util.*;

public class ConnectedComponents {
    static boolean[] visited = new boolean[3];
    static int count = 0;
    static ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

    static void province(int index){
        visited[index] = true;

        for(int i=0; i<adj.size(); i++){
            for(int j=0; j<adj.size(); j++){
                if(adj.get(i).get(j) == 1 && visited[j] ==false){
                    province(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 0);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);

        for(int i=0; i<visited.length; i++){
            if(visited[i] == false){
                province(i);
                count++;
            }
        }
        
        System.out.println(count);
    }
}
