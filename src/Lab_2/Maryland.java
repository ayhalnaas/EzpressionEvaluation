package Lab_2;

public class
Maryland extends State{
    Maryland(){};
    public void PrintMe(){
        System.out.println("Read it.");
    }

    public static void main(String[] args) {
        Region east =new State();
        State md =new Maryland();
        Object obj =new Place();
        Place usa =new Region();
        md.PrintMe();
        east.PrintMe();
        ((Place)obj).PrintMe();
        obj=md;
        ((Maryland)obj).PrintMe();
        obj=usa;
        ((Place)obj).PrintMe();
        usa=md;
        ((Place)usa).PrintMe();

    }
}
