package main.java.com.prof.algorithms;

public class DimensionalArray {

    public static void main(String[] args) {
        int[][] array = {{3, 5, 6}, {6, 5, 2}};
        System.out.println(maximumWealth(array));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int wealth = 0;
            for (int bank : customer) {
                wealth += bank;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
