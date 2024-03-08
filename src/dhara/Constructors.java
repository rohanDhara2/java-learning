package dhara;
/*
    Constructor in java is a special type of method.It is
    used to initialize the object at the time of its creation.
    It's name should be same with class name and has no return type.
    Every time we create object the constructor will bw called.
    Constructor is of two types 1.Parameterized 2.default
 */
class Tshirt{
    private int price;
    private String name;

    public Tshirt(){ //Default constructor
       name = "sweat";
       price=500;
    }
    //constructor overloading
    public Tshirt(String name,int price){ //parameterized constructor
        this.name=name;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Tshirt ts1 = new Tshirt();
        Tshirt ts2 = new Tshirt("bellboys",580);
        System.out.println(ts1.getName()+"\t"+ts1.getPrice());//at this point object has no value so name will be null and price will be 0, default values.
        System.out.println(ts2.getName()+"\t"+ts2.getPrice());
//        ts.setName("Cowl neck");
//        ts.setPrice(1120);
    }
}
