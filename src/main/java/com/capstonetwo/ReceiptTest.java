package com.capstonetwo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {
    @Test
    public void printReceiptTest(){
        Sandwich sandwich = new Sandwich(4);
        List<Sandwich> sandwichList = new ArrayList<>();
        sandwichList.add(sandwich);
        Receipt receipt = new Receipt(sandwichList);
        receipt.printReceipt();
    }

}