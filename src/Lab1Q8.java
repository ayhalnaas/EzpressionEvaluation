public class Lab1Q8 {
    //Write a short Java method that counts the number
    // of vowels in a given character string.
    public int CountsVowels(String s){
        int count = 0 ;
        String vowels ="aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Lab1Q8 obj = new Lab1Q8();
        System.out.println("count = "+obj.CountsVowels("hello world"));
    }
}
