package ru.mirea.lab_3;

import java.util.SortedMap;

public class TestDog{

    public static void main(String[] args) {
        ShibaInu shiba = new ShibaInu("red", "Middle", 5);
        Pug pug = new Pug("black","Tiny",2);
        pug.getVoice();
        shiba.getVoice();

        System.out.printf("ShibaInu is "+shiba.dogSparkle()+"\n");
        System.out.printf("Pug is "+pug.dogSparkle()+"\n");

        shiba.toHumanAge();
        pug.toHumanAge();
        System.out.printf("Shiba is "+shiba.humanAge+" yrs old in human age!\n");
        System.out.printf("Pug is "+pug.humanAge+" yrs old in human age!\n");
    }
}
