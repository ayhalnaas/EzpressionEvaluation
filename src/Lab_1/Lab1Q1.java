package Lab_1;

import java.util.Scanner;

public class Lab1Q1 {
    //Write a short Java method, inputAllBaseTypes,
    // that inputs a different value of each base type from the standard
    // input device and prints it back to the standard output device.
    public void inputAllBaseTypes (){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter name: ");
        obj.nextLine();
        System.out.println("enter age: ");
        obj.nextInt();
        System.out.println("enter avg: ");
        obj.nextDouble();
        System.out.println("Are you Married?: ");
        obj.nextBoolean();
        System.out.println("enter byte : ");
        obj.nextByte();
        System.out.println("enter number short: ");
        obj.nextShort();
        System.out.println("enter salary: ");
        obj.nextFloat();
        System.out.println("enter number long: ");
        obj.nextLong();
    }
}
