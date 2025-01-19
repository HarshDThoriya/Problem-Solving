package PrefixSum;

public class CheckIfAllInRangeCovered {
    public static void main(String[] args) {
        int[][] ranges = new int[][]{{1,2},{3,4},{5,6}};
        int[] avaRange = new int[52];
        int left = 2;
        int right = 5;
        for(int i=0; i<ranges.length; i++){
            avaRange[ranges[i][0]] += 1;
            avaRange[ranges[i][1]+1] += -1;
        }

        for(int i=1; i<avaRange.length; i++){
            avaRange[i] += avaRange[i-1];
        }

        boolean flag = true;

        for(int i=left; i<=right; i++){
            if(avaRange[i]==0)
                flag = false;
                break;
        }

        System.out.println(flag);
    }
}
