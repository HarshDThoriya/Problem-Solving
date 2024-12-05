import java.util.*;

public class representation {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<3; i++){
            adjacencyList.add(new ArrayList<>());
        }

        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(0);
        adjacencyList.get(1).add(2);
        adjacencyList.get(2).add(0);
        adjacencyList.get(2).add(1);

        int[][] adjacencyMatrix = new int[3][3];

        adjacencyMatrix[0][1] = 1;
        adjacencyMatrix[0][2] = 1;
        adjacencyMatrix[1][0] = 1;
        adjacencyMatrix[1][2] = 1;
        adjacencyMatrix[2][0] = 1;
        adjacencyMatrix[2][1] = 1;
    }
}
