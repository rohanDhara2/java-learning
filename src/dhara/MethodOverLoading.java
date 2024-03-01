package dhara;

class Numbers
{
    public int addNumber(int n1,int n2)
    {
        return n1+n2;
    }
    public double addNumber(int n1,double n2) // if int and double are there then return type should be double
    {
        return n1+n2;
    }
}
public class MethodOverLoading {
    public static void main(String[] args)
    {
        Numbers n = new Numbers();
        int result = n.addNumber(4,5);
        double result2 = n.addNumber(4,5.56);
        System.out.println(result);
        System.out.println(result2);
    }
}
