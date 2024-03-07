package dhara;
/*
    we can use static variables inside constructor.
    static block can have only static variables and methods.
    it doesn't matter how many object we create static block will be called only once.

 */
class Phone{
    int price;
    static String name;
    String brand;
}
public class StaticBlock {
    public static void main(String[] args) {
        Phone ph = new Phone();
        Phone.name="Mobile"; // as this is a static variable we have to access it by class name
        ph.price=5000;
        ph.brand="Iphone";

        System.out.println(ph.brand + " "+ph.price+" "+Phone.name);
    }
}
