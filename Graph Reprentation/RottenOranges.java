import java.util.*;

public class RottenOranges {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(0).add(1);
        adj.get(0).add(1);

        adj.get(1).add(1);
        adj.get(1).add(1);
        adj.get(1).add(0);

        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(1);

        int initialFreshOranges = 0;

        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.size(); j++) {
                if (adj.get(i).get(j) == 2) {
                    queue.add(new int[] { i, j });
                }
                if (adj.get(i).get(j) != 0) {
                    initialFreshOranges++;
                }
            }
        }

        if (initialFreshOranges == 0) {
            System.out.println("0");
            System.exit(1);
        }

        int minutes = 0;

        int rottenCount = 0;

        while (!queue.isEmpty()) {
            rottenCount += queue.size();
            int tempSize = queue.size();

            for (int i = 0; i < tempSize; i++) {
                int[] temp = queue.poll();

                if (temp[0] - 1 > 0 && adj.get(temp[0] - 1).get(temp[1]) == 1) {
                    adj.get(temp[0] - 1).set(temp[1], 2);
                    queue.add(new int[] { temp[0] - 1, temp[1] });
                }
                if (temp[0] + 1 < adj.size() && adj.get(temp[0] + 1).get(temp[1]) == 1) {
                    adj.get(temp[0] + 1).set(temp[1], 2);
                    queue.add(new int[] { temp[0] + 1, temp[1] });
                }
                if (temp[1] - 1 > 0 && adj.get(temp[0]).get(temp[1] - 1) == 1) {
                    adj.get(temp[0]).set(temp[1] - 1, 2);
                    queue.add(new int[] { temp[0], temp[1] - 1});
                }
                if (temp[1] + 1 < adj.size() && adj.get(temp[0]).get(temp[1] + 1) == 1) {
                    adj.get(temp[0]).set(temp[1] + 1, 2);
                    queue.add(new int[] { temp[0], temp[1] + 1 });
                }
            }

            if (queue.size() != 0) {
                minutes++;
            }
        }

        if (initialFreshOranges == rottenCount) {
            System.out.println(minutes);
        } else {
            System.out.println("-1");
        }
    }
}
