import java.util.*;

public class SetMatrixZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(0,1,2,0)));
        arr.add(new ArrayList<>(Arrays.asList(3,4,5,2)));
        arr.add(new ArrayList<>(Arrays.asList(1,3,1,5)));

        int n = arr.size();
        int m = arr.get(0).size();

        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr.get(i).get(j) == 0) {
                    arr.get(i).set(0, 0);

                    if (j != 0)
                        arr.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr.get(i).get(j) != 0) {
                    if (arr.get(i).get(0) == 0 || arr.get(0).get(j) == 0) {
                        arr.get(i).set(j, 0);
                    }
                }
            }
        }

        if (arr.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                arr.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                arr.get(i).set(0, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }

    }
}
