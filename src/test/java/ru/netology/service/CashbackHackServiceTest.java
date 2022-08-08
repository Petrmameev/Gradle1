package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldBuyMore100ForCashback(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn0IfAmountMultipleBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(2000);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnCashbackIfSumLess1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 330;
        int actual = cashbackHackService.remain(670);
        Assert.assertEquals(expected, actual);
    }

}