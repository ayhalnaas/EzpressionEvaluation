package Lab_2;

import java.util.Arrays;

public class R_2_14 {
    //basmala alnaas
    public static void main(String[] args) {
        try {
            int[] A = new int[6];
            int i = 7;
            if (Arrays.asList(A).size()>i){
                int x = A[i];
            }
            else { throw new ArrayIndexOutOfBoundsException();}
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Don\'t try buffer overflow attacks in Java");
        }
    }
}
