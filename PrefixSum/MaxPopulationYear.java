package PrefixSum;

public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] logs = new int[][]{{1993,1999},{2000,2010}};

        int[] year = new int[2051];

        for(int[] log : logs){
            year[log[0]] ++;
            year[log[1]] --;
        }

        int max = year[1950], maxYear = 1950;

        for(int i = 1951; i<year.length; i++){
            year[i] += year[i-1];

            if(year[i] > max){
                max = year[i];
                maxYear = i;
            }
        }

        System.out.println(maxYear);
    }
}
