public class TestStack {
    public static void main(String[] args) {
        LinkedStack<Integer>s= new LinkedStack<>();
        s.push(11);
        s.push(12);
        s.push(13);
        System.out.println(s.top()+" is the top");
        System.out.println(s.pop()+" is removed ");
        System.out.println(s.pop()+" is removed ");
        System.out.println(s.pop()+" is removed ");
        System.out.println(s.pop()+" is removed ");


    }
}
