package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void shouldBuyMore100ForCashback(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1900);
        int expected = 100;
        assertEquals(actual, expected);

    }
    @Test
    public void shouldReturn0IfAmountMultipleBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(2000);

        assertEquals(actual, expected);

    }
    @Test
    public void shouldReturnCashbackIfSumLess1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 330;
        int actual = cashbackHackService.remain(670);
        assertEquals(actual, expected);
    }


}