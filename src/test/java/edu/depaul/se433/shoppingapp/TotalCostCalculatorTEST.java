package edu.depaul.se433.shoppingapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class TotalCostCalculatorTEST {

    @ParameterizedTest
    @CsvFileSource(resources = "/WeakNormal.csv")
    @DisplayName("Weak Normal")
    void weakNormal(int initialCost,String State,ShippingType shipping, double expect ){
        double actual = TotalCostCalculator.calculate(initialCost,State,shipping);
        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WeakRobust.csv")
    @DisplayName("Weak Robust")
    void weakRobust(int initialCost,String State,ShippingType shipping, double expect ){
        if (expect != -55){//test should not error out
            double actual = TotalCostCalculator.calculate(initialCost,State,shipping);
            assertEquals(expect, actual);
        }
        else{
            assertThrows(NullPointerException.class,()->{
                double actual = TotalCostCalculator.calculate(initialCost,State,shipping);
                //fail();
            });
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/StrongNormal.csv")
    @DisplayName("Strong Normal")
    void strongNormal(int initialCost,String State,ShippingType shipping, double expect ){
        double actual = TotalCostCalculator.calculate(initialCost,State,shipping);
        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/StrongRobust.csv")
    @DisplayName("Strong Robust")
    void strongRobust(int initialCost,String State,ShippingType shipping, double expect ){
        if (expect != -55){//test should not error out
            double actual = TotalCostCalculator.calculate(initialCost,State,shipping);
            assertEquals(expect, actual);
        }
        else{
            assertThrows(NullPointerException.class,()->{
                double actual = TotalCostCalculator.calculate(initialCost,State,shipping);

            });

        }
    }

}
