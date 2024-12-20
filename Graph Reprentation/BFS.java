import java.util.*;

public class BFS {
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[5];
        ArrayList<Integer> bfs = new ArrayList<>();

        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()){
            int i = queue.poll();
            bfs.add(i);

            for(int j: adj.get(i)){
                if(visited[j] == false){
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }

        for(int i=0; i<bfs.size(); i++){
            System.out.print(bfs.get(i) + " ");
        }
    }    
}
