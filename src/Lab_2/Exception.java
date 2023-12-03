package Lab_2;

public class Exception {
    //ayh alnaas
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int index = 5 ;
            int value = array[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Don\'t try buffer overflow attacks in Java");
        }
    }
}
