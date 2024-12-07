import java.util.*;

public class DFS {
    static boolean[] visited = new boolean[5];
    static ArrayList<Integer> dfs = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    static void dfs(int i) {
        dfs.add(i);
        visited[i] = true;

        for(int j : adj.get(i)){
            if(visited[j] == false){
                dfs(j);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        dfs(0);

        for(int i=0; i<dfs.size(); i++){
            System.out.print(dfs.get(i) + " ");
        }
    }
}
