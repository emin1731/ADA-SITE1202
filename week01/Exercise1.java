package week01;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Exercize 1 - Write a simple program to greet the user 

        // -- First way
        System.out.println("Hello " + "Emin Dabakhov");

        // -- Second way
        System.out.println("Hello " + args[0]);

        // -- Third way 
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();

        // Exercize 2 - Write a program to sum up the numbers.

        // -- First way
        Integer num1 = 12;
        Integer num2 = 12;
        Integer num3 = 12;
        System.out.println(num1 + num2 + num3);

        // -- Second way
        Scanner ex2 = new Scanner(System.in);
        Integer num1_scanner = ex2.nextInt();
        Integer num2_scanner = ex2.nextInt();
        Integer num3_scanner = ex2.nextInt();
        System.out.println(num1_scanner + num2_scanner + num3_scanner);
        ex2.close();


        // Exercize 3 - Re-write the previous program
        Integer n1 = 12;
        Long n2 = 12L;
        Float n3 = 12.12F;
        
        Float sum_float = n1 + n2 + n3;
        Float sum_int = n1 + n2 + n3;
        System.out.println(sum_float);
        System.out.println(sum_int);

        // Exercize 4 - Re-write the previous program
        // a. b.
        System.out.println((1/5) * (2/3) - (3/10));     // prints an integer and then makes new line 
        System.out.print((1/5) * (2/3) - (3/10));       // just prints an integer 
        System.out.printf("%f%n", (1.0/5) * (2.0/3) - (3.0/10));  // wey to print format specified ooutput 

        // c. format specifier should be %f because the resulting value has a fraction 

        // Exercize 5 - Re-write the previous program
        // a.
        int value_int = 42;

        // b.
        System.out.println("Integer value: " + value_int);
        System.out.printf("Hexadecimal format: %x%n", value_int);
        System.out.printf("Octal format: %o%n", value_int);

        // c.
        float value__float = 3.14F;

        // d.
        System.out.println("Float value: " + value__float);
        System.out.printf("Decimal floating-point format: %.2f%n", value__float);
        System.out.printf("Scientific notation: %.2e%n", value__float);


    }
}