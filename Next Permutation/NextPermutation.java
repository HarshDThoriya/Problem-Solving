import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        sc.close();
        
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
           Collections.reverse(arrayList);
        }
        else{
            for (int i = n - 1; i > ind; i--) {
                if (arrayList.get(i) > arrayList.get(ind)) {
                    int tmp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(ind));
                    arrayList.set(ind, tmp);
                    break;
                }
            }
    
            List<Integer> sublist = arrayList.subList(ind + 1, n);
            Collections.reverse(sublist);

        }

        for(int i=0; i<n; i++){
            System.out.println(arrayList.get(i));
        }

       
    }
}
