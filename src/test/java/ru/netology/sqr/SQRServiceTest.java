package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void testCalculateSqrt() {
        SQRService service = new SQRService();
        int expected = 3;
        long actual = service.calculateSqrt(300, 200);

        assertEquals(expected, actual);
    }
}
