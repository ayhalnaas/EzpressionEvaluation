package lab10;

public class Test {
    public static void main(String[] args) {
            Tree<String>tree= new Tree<>();
            Position<String>p =tree.addRoot("root");

            tree.addLeft(p,"left child");
            tree.addRight(p,"right child");
//        System.out.println(tree.root().getElement());
//        System.out.println(tree.size());
//        tree.remove(p);
//        System.out.println(tree.root().getElement());
//        System.out.println(tree.size());
            tree.printInOrder(p);


        }

}
