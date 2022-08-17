package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testSpent900() {
        CashbackHacker service = new CashbackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void testSpent1100() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void testSpent1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testSpent1451() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1451;
        int actual = service.remain(amount);
        int expected = 549;
        assertEquals(expected, actual);
    }
}