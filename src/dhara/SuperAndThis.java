package dhara;
/*
    super() is always called first when a constructor is called, even if we not mention.
    Every class in Java extends Object class even we don't mention

 */
class One
{
    public One()
    {
        super(); //calls the Object class's constructor
        System.out.println("in one's default const");
    }
    public One(int n)
    {
        this(); //it will call the constructor of same class
        System.out.println("in one's Parameter const");
    }

}
class Two extends One
{
    public Two()
    {
        super(2); //calls super class's parameterized constructor
        System.out.println("in two's default const");
    }
    public Two(int n)
    {
        this(); //it will call the constructor of same class
        System.out.println("in two's parameter const");
    }
}
public class SuperAndThis {
    public static void main(String[] args) {
        Two obj = new Two(6);
    }
}
