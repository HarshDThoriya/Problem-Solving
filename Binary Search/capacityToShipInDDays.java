public class capacityToShipInDDays {
    static boolean isPossible(int[] weights, int currentWeightOfShip, int maxDays) {
        int currentWeightOfShipTemp = currentWeightOfShip;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > currentWeightOfShip) {
                return false;
            }
            if (currentWeightOfShipTemp < weights[i]) {
                maxDays--;
                currentWeightOfShipTemp = currentWeightOfShip;
            }
            
            currentWeightOfShipTemp -= weights[i];

            if (maxDays <= 0) {
                return false;
            }
        }

        return maxDays >= 0 ? true : false;
    }

    public static void main(String[] args) {
        int weights[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < weights.length; i++) {
            max += weights[i];

            if (min > weights[i]) {
                min = weights[i];
            }
        }

        int leastWeight = -1;

        while (min <= max) {
            int mid = (min + max) / 2;

            boolean temp = isPossible(weights, mid, days);

            if (temp == true) {
                leastWeight = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(leastWeight == -1 ? -1 : leastWeight);
    }
}
