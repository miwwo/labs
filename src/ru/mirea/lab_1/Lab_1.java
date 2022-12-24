package ru.mirea.lab_1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//var - 5
public class Lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number to find its factorial\n");
        int a;
        int result = 1;
        a = scanner.nextInt();
        for (int i = 1; i <=a ; i++)
            result = result*i;
        System.out.printf("The factorial of the number " + a + " is " + result);

        /*ArrayList<Integer> integers = new ArrayList<Integer>();

        for (Integer integer: integers) {
            System.out.println(integer);
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(Integer.toString(integers.get(i)));
        }*/
    }
}
