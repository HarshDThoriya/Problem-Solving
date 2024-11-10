import java.util.*;

public class UnionSortedArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] arr1 = new int[n];
    int[] arr2 = new int[m];

    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    for (int i = 0; i < m; i++) {
      arr2[i] = sc.nextInt();
    }

    int i = 0, j = 0;
    ArrayList<Integer> arr3 = new ArrayList<>();
    while (i < n && j < m) {
      if (arr1[i] <= arr2[j]) {
        if (arr3.size() == 0 || arr3.get(arr3.size() - 1) != arr1[i])
          arr3.add(arr1[i]);
        i++;
      } else {
        if (arr3.size() == 0 || arr3.get(arr3.size() - 1) != arr2[j])
          arr3.add(arr2[j]);
        j++;
      }
    }
    while (i < n) {
      if (arr3.get(arr3.size() - 1) != arr1[i])
        arr3.add(arr1[i]);
      i++;
    }
    while (j < m) {
      if (arr3.get(arr3.size() - 1) != arr2[j])
        arr3.add(arr2[j]);
      j++;
    }

    for (int k = 0; k < arr3.size(); k++) {
      System.out.println(arr3.get(k));
    }

    sc.close();
  }
}
