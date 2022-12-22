package ru.netology.sqr;

import ru.netology.javaqa.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int count = service.calcSqrtService(-150, 5);
        System.out.println(count);




    }
}
