package be.intec.programming_assignment;

public class HelloGoodbye {

    public static void main(String[] args) {

        /*Strings and command-line arguments. Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below 
        (with the names for the hello message in the same order as the command-line arguments and with the names for the goodbye message in reverse order).
        
~/Desktop/hello> javac HelloGoodbye.java

Hello Kevin and Bob.
Goodbye, Bob and Kevin.
~/Desktop/hello> java HelloGoodbye Kevin Bob

~/Desktop/hello> java HelloGoodbye Alejandra Bahati
Hello Alejandra and Bahati.
Goodbye Bahati and Alejandra. 


*/

        //Hello Kevin and Bob.
        System.out.print("Hello ");
        System.out.print(args[0]);
        System.out.print(" and ");
        System.out.println(args[1]);

        //Goodbye, Bob and Kevin.
        System.out.print("Goodbye, ");
        System.out.print(args[1]);
        System.out.print(" and ");
        System.out.println(args[0]);
    }

}
