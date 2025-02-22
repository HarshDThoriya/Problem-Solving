public class minimumDaysBouquets {
    static  boolean findIfPossible(int[] bloomDay, int dayCount, int m, int k){
        int tempK = k;

        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= dayCount){
                tempK--;
            }   
            else{
                tempK = k;
            }

            if(tempK == 0){
                m--;
                tempK = k;
            }

            if(m==0){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] bloomDay = new int[]{7,7,7,7,13,12,7,7,7,7,7};
        int m = 3, k = 3;

        if(m*k > bloomDay.length){
            System.out.println(-1);
            System.exit(0);
        }

        int max = -1;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<bloomDay.length; i++){
            if(max < bloomDay[i]){
                max = bloomDay[i];
            }
            if(min > bloomDay[i]){
                min = bloomDay[i];
            }
        }

        int low = min;
        int high = max;

        int minDays = -1;

        while(low <= high){
            int mid = (low+high)/2;

            boolean temp = findIfPossible(bloomDay, mid, m, k);

            if(temp == true){
                minDays = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }


        System.out.println(minDays);
        System.exit(0);
    }
}