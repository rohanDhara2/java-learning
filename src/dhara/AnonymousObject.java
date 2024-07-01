package dhara;
class A{
    public A(){
        System.out.println("Object created.");
    }
    public void show(){
        System.out.println("inside show method");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
//        A obj; //reference created.
//        obj = new A(); // Object created. It is a referenced object .
        new A().show(); // in this case we are not creating any reference, so it is called anonymous object
        //disadvantage is we can't reuse the same object everytime we have to create a new object
        new A().show();
        //test
    }
}
