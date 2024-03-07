package dhara;
/*
    we can use static variables inside constructor.
    static block can have only static variables and methods.
    it doesn't matter how many object we create static block will be called only once.
    static variable will be called at very first time even before the object creation.
    every time you are creating the object there are 2 steps 1.classloads 2.objcets instantiated
    class will load only once.classloader have all the class that are loaded.
    static block will be called every time we load a class,that's why it called before constructor.
    If we don't create any object static block will not be called . what if we want to call only static block
    we have to use Class.forName(--classname--) to load the class then the static block will get called

*/
class Phone{
    int price;
    static String name;
    String brand;
    //as name will be same for all the objects we can initialize a static block here
    //static block is used to initialize static variables
    static {
        name = "Mobile Phone";
        System.out.println("static block called");
    }
    public Phone(){
        brand = "";
        price=1500;
    }
    public void show(){
        System.out.println(brand + " "+price+" "+name);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("Phone");
//        Phone ph1 = new Phone();
//        //we have a static block so no need to give value to static variable here
//        //Phone.name="Mobile"; // as this is a static variable we have to access it by class name
//        ph1.price=5000;
//        ph1.brand="Iphone";
//
//        Phone ph2 = new Phone();
//        ph2.price=8000;
//        ph2.brand="Samsung";
    }
}
