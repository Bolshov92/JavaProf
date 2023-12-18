package com.prof.homework.functionalInterface;

import java.util.Optional;

@FunctionalInterface
public interface SafeDivision {

    Optional<Double>divide(double a , double b);
}
