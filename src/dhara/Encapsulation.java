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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
