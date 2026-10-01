/*
Read personal details from input and display them.

Instructions
Read a name, an age, and a city from input (three lines).
*/

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter age: ");
        int age =  sc.nextInt();

        System.out.print("Enter city: ");
        String city = sc.nextLine().trim();

        // Print the info
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("City: %s\n", city);

        sc.close();
    }
}
