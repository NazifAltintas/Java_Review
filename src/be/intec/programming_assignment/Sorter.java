package be.intec.programming_assignment;

public class Sorter {

    public static void main(String[] args) {

       /*Three-sort. Write a program that takes three integer command-line arguments and prints them in ascending order.
       Use Math.min() and Math.max().

For these exercises, don't use loops or conditionals. */
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        int mid = num1 + num2 + num3 - min - max;

        System.out.println("(" + min + ")-(" + mid + ")-(" + max + ")");

    }


}
