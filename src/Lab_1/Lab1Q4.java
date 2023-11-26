package Lab_1;

public class Lab1Q4 {
    //Write a short Java method, isEven, that takes an int i and returns true if and only if i is even.
    // Your method cannot use the multiplication, modulus, or division operators, however.
    public Boolean isEven (int i){
        int b =(byte)i;
        if ((b & 1) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Lab1Q4 obj = new Lab1Q4();
        System.out.println(obj.isEven(4));
    }
    }
