package dhara;
/*
    Static variables are shared by all the objects.If we change the value of static variable it will be changed for all the objects.
    Static variables are accessed by their class name not using object reference.
    Static variables can be used inside not static methods.
    Static variables are the members of the class only not the object that's why we can use classname.static-variablename to access it.
 */
class Mobile{
    static String name;
    int price;
    String brand;

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}
public class StaticVariables {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile.name="Phone";
        obj1.price=80000;
        obj1.brand="Iphone";

        Mobile obj2 = new Mobile();
        Mobile.name="Phone";
        obj2.price=20000;
        obj2.brand="POCO";

        Mobile.name = "SmartPhone"; //it will change all objects value as they are sharing the variable

        obj1.show();
        obj2.show();
    }
}
