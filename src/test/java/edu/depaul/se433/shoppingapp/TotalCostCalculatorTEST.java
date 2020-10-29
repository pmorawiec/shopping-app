package edu.depaul.se433.shoppingapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalCostCalculatorTEST {

    @ParameterizedTest
    @CsvFileSource(resources = "/WeakNormal.csv")
    @DisplayName("weakNormal")
    void weakNormal(int initialCost,String State,ShippingType shipping, double expect ){
        assertEquals(initialCost, 55);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WeakRobust.csv")
    @DisplayName("weakRobust")
    void weakRobust(int initialCost,String State,ShippingType shipping, double expect ){
        assertEquals(initialCost, 55);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/StrongNormal.csv")
    @DisplayName("StrongNormal")
    void strongNormal(int initialCost,String State,ShippingType shipping, double expect ){
        assertEquals(initialCost, 55);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/StrongRobust.csv")
    @DisplayName("StrongRobust")
    void strongRobust(int initialCost,String State,ShippingType shipping, double expect ){
        assertEquals(initialCost, 55);
    }

}
