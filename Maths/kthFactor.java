package Maths;

import java.util.*;

public class kthFactor {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;

        int cnt = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    l.add(n / i);
                if (++cnt == k) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
        if (l.size() + cnt < k) {
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println(l.get(l.size() - (k - cnt)));
    }
}
