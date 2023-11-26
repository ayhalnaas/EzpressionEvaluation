package Lab_1;

public class Lab1Q9 {
    //Write a short Java method that
    // uses a StringBuilder instance to remove
    // all the punctuation from a
    // string s storing a sentence, for example,
    // transforming the string
    // "Let’s try, Mike!" to "Lets try Mike".
    public String remove_punctuation(String string){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if (!Character.isLetterOrDigit(x)&&!Character.isWhitespace(x)) {
                continue;
            }
            result.append(x);}

                return result.toString();
            }

    public static void main(String[] args) {
        Lab1Q9 obj = new Lab1Q9();
        System.out.println(obj.remove_punctuation("Let’s try, Mike!"));
    }
}





