import java.util.Scanner;

public class Lab1Q7 {
    //Write a short Java method that takes an integer n and returns the sum of
    // the squares of all positive integers less than or equal to n.
    public  int SumSquaresPositiveIntegers(){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            int num = in.nextInt();
            if (num>=0){
                num = num*num;
                sum += num;
            }
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return sum;
    }

    public static void main(String[] args) {
        Lab1Q7 obj = new Lab1Q7();
        System.out.println("sum = "+obj.SumSquaresPositiveIntegers());
    }
}
