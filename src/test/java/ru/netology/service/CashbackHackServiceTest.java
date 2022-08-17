package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testSpent900() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;
        int actual = cashbackHacker.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);

    }

    @Test
    public void testSpent999() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 999;
        int actual = cashbackHacker.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);

    }

    @Test
    public void testSpent1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;
        int actual = cashbackHacker.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testSpent1100() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1100;
        int actual = cashbackHacker.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
}