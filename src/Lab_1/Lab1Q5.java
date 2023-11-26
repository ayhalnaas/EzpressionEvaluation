package Lab_1;

import java.util.Scanner;

public class Lab1Q5 {
    //Write a short Java method that takes an integer n and
    // returns the sum of all positive integers less than or equal to n.
    public  int SumPositiveIntegers(){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            int num = in.nextInt();
            if (num>=0){
                sum += num;
            }
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return sum;
    }

    public static void main(String[] args) {
        Lab1Q5 obj = new Lab1Q5();
        System.out.println("sum = "+obj.SumPositiveIntegers());
    }
}
