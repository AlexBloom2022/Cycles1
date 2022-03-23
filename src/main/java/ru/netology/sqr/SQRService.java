package ru.netology.sqr;

public class SQRService {
    public int calculateSqrt(int upper, int lower) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i <= upper) & (i * i >= lower)) {
                counter = counter+1;
            }
        }
        System.out.println(counter);
        return counter;
    }
}