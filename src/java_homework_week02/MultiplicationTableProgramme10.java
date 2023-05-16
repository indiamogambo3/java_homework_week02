package java_homework_week02;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

import java.util.Scanner;

public class MultiplicationTableProgramme10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input any number : ");
        int n = s.nextInt();
        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++)

            System.out.println(n + " x " + i + " = " + n * i);


    }

}
