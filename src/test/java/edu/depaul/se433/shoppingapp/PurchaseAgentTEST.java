package edu.depaul.se433.shoppingapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.mockito.stubbing.Answer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PurchaseAgentTEST {


    // Ensure the zero works, ensure if there are any exceptions throne, ensure that None of the values are negative
    @Test
    @DisplayName("Average Purchase")
    void test1(){
        List<Purchase> yo = new ArrayList<>();
        PurchaseDBO server = mock(PurchaseDBO.class);
        Purchase p1 = Purchase.make("a",
                LocalDate.of(2020,8,29),
                10,
                "IL",
                "STANDARD");
        Purchase p2 = Purchase.make("a",
                LocalDate.of(2020,8,29),
                55,
                "IL",
                "STANDARD");
        Purchase p3 = Purchase.make("a",
                LocalDate.of(2020,8,29),
                2000,
                "IL",
                "STANDARD");

        yo.add(p1); yo.add(p2); yo.add(p3);
        when(server.getPurchases()).thenReturn(yo);

        PurchaseAgent test = new PurchaseAgent(server);
        Double actual = test.averagePurchase();
        verify(server,times(1)).getPurchases();

        assertEquals(688.3333333333334,actual);

    }


}
