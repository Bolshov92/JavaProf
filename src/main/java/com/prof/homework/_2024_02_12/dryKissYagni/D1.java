package com.prof.homework._2024_02_12.dryKissYagni;

import java.util.List;

public class D1 implements CalculatorList {
    public static void main(String[] args) {
    }

    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }

    @Override
    public double calculatorAverage(List<Double> numbers) {
        return numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

    }

    @Override
    public double calculatorSum(List<Double> numbers) {
        return numbers.stream()
                .reduce(0.0, Double::sum);

    }
}