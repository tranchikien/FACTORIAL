/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FACTORIAL;

/**
 *
 * @author CHI KIEN
 */
public class Factorial {
 public static int factorial(int n) {
        System.out.println("Pushing n = " + n + " onto stack");
        if (n == 0) {
            System.out.println("Base case reached. Returning 1.");
            return 1;
        }

        int result = n * factorial(n - 1);
        System.out.println("Popping n = " + n + " from stack. Returning " + result);
        return result;
    }

    public static void main(String[] args) {
        int number = 3;
        System.out.println("Calculating factorial of " + number);
        int result = factorial(number);
        System.out.println("Final Result: " + result);
    }
}
