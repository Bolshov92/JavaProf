package com.prof.homework._2024_02_12.dryKissYagni;

import java.util.List;


public class MathUtils {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    

        public static int calculateSum(List<Integer> numbers) {
            return calculateSum(numbers.stream()
                    .mapToInt(Integer::intValue)
                    .toArray());
        }

    }


