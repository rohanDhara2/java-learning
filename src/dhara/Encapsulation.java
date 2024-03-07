package dhara;
/*
    by making instance variables private we are restricting direct access
    if someone want to access it they can use methods,
    so we are binding the data with the methods,
    encapsulating the data with methods is called encapsulation

 */
class Human{
    private String name;
    private int age;

    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("KOUSHIK");
        obj.setAge(32);
        System.out.println(obj.getName()+" "+obj.getAge());
    }
}
