package be.intec.programming_assignment;

public class RightTriangle {

    public static void main(String[] args) {


/* Integers and booleans. Write a program RightTriangle that takes three int command-line arguments and determines 
whether they constitute the side lengths of some right triangle.


The following two conditions are necessary and sufficient:

       * Each integer must be positive.
       * The sum of the squares of two of the integers must equal the square of the third integer.
       
Example:

~/Desktop/hello> javac RightTriangle.java

~/Desktop/hello> java RightTriangle 3 4 5
true

~/Desktop/hello> java RightTriangle 13 12 5
true

~/Desktop/hello> java RightTriangle 1 2 3
false

~/Desktop/hello> java RightTriangle -3 4 -5
false 

*/


        boolean rightTriangle;
        boolean positive;

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        positive = (a > 0) && (b > 0) && (c > 0);

        double sqrt_a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
        double sqrt_b = Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2));
        double sqrt_c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        rightTriangle = (positive && (sqrt_a == a || sqrt_b == b || sqrt_c == c));

        System.out.println(rightTriangle);

    }
}