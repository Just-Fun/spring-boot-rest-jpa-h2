package com.serzh.example.coursera;

import java.util.Random;

public class TempJavaClass {

    public static void main(String[] args) {
        int foo = MyFileKt.foo();

        TempKtClassKt.displaySeparator('g', 2);
        //        TempKtClassKt.displaySeparator();

        TempKtClassKt.displaySeparatorForJavaDefaultArgs();
        TempKtClassKt.displaySeparatorForJavaDefaultArgs('e');
        TempKtClassKt.displaySeparatorForJavaDefaultArgs('e', 5);

        Random rand = new Random();
        int value = rand.nextInt(50);
    }

}
