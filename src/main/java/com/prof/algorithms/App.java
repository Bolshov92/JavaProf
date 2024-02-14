package com.prof.algorithms;

public class App {
    /**
     * Start
     * check Breakpoints {0, 200,375,550,750,950};
     * Check MaxStep{400};
     *
     * Start Drive ignore Break 200km { left half fuel}
     * Let's stop by Break 375km and charging ;
     * Let's keep moving  and ignore break {550} left more then half fuel};
     * Let's stop by Break 750km and charging ;
     * Let's keep moving until the end of route ;
     * Arrived at the end of route;
     * End ;
*/

    public static void main(String[] args) {
        int [] breakPoints = {0, 200, 375, 550, 750, 950};

    }
    public class Main {
        public static void main(String[] args) {
            int [] breakPoints = {0, 200, 375, 550, 750, 950};

            System.out.println(maxStops(breakPoints, 400));
        }

        public static int maxStops(int[] arr, int maxStep){
            int countStops = 0;
            int currentPosition = 0;

            for (int i = 0; i < arr.length; ) {
                int nextStop = currentPosition + maxStep;
                while (i < arr.length && arr[i] <= nextStop) {
                    i++;
                }
                if (i == currentPosition) {
                    return -1;
                }
                countStops++;
                currentPosition = arr[i - 1];
            }
            return countStops;
        }
    }


}