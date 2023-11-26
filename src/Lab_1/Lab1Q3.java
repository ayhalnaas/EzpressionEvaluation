package Lab_1;

public class Lab1Q3 {
    //Write a short Java method, isMultiple, that takes two long values, n and m,
    // and returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
    public boolean isMultiple(long n,long m){
        if (m%n==0 && n<=m){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       Lab1Q3 obj = new Lab1Q3();
        System.out.println(obj.isMultiple(3,9));


    }
}
