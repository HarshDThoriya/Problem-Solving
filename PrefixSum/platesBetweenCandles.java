package PrefixSum;

import java.util.TreeMap;

public class platesBetweenCandles {
    static int[] calculatePlatesBetweenCandles(String s, int[][] queries) {
        if(s == null || s.length() == 0) return new int[]{};
        int[] res = new int[queries.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '|') {
                map.put(i, count++);
            }
        }

        for(int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int from = query[0], to = query[1];
            Integer i1 = map.ceilingKey(from), i2 = map.floorKey(to);
            if(i1 == null || i2 == null || i1 > to || i2 < from) {
                res[i] = 0;
            } else {
                int countOfCandle = map.get(i2) - map.get(i1) + 1;
                int countOfPlate = to - from + 1 - countOfCandle;
                countOfPlate -= i1 - from;
                countOfPlate -= to - i2;
                res[i] = countOfPlate;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "**|**|***|";
        int [][] queries = new int[][]{{2,5},{5,9}};

        int[] ans = calculatePlatesBetweenCandles(str, queries);


        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
