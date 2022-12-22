package ru.netology.javaqa.javaqamvn.services;


public class SQRService {

    public int calcSqrtService (int min, int max) {
        int count = 0;
        for (int cycle = 10; cycle < 99; cycle++) {
            int a = cycle * cycle;
            if (a >= min && a <= max) {
                count++;
                }
            }

        return (count);
    }

}
