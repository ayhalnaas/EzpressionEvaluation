public class Lab1Q8 {
    //Write a short Java method that counts the number
    // of vowels in a given character string.

    public int CountsVowels(String string){
        int count = 0 ;

        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if (x == 'a'||x == 'e'||x == 'i'||x == 'o'||x == 'u'||
                    x == 'A'||x == 'E'||x == 'I'||x == 'O'||x == 'U'
            ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Lab1Q8 obj = new Lab1Q8();
        System.out.println("count = "+obj.CountsVowels("hello every body"));
    }
}
