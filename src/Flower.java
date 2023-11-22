public class Flower {
    //Write a Java class, Flower, that has three instance variables of type String, int, and float,
    // which respectively represent the name of the flower, its number of petals, and price.
    // Your class must include a constructor method that initializes each variable to an appropriate value,
    // and your class should include methods for setting the value of each type,
    // and getting the value of each type.
    private String name ;
    private int num_of_petals;
    private float price;

    public Flower(String name, int num_of_petals, float price) {
        this.name = name;
        this.num_of_petals = num_of_petals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum_of_petals() {
        return num_of_petals;
    }

    public void setNum_of_petals(int num_of_petals) {
        this.num_of_petals = num_of_petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
