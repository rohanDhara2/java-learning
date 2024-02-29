package dhara;
class AddNumbers
{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
}
public class FirstClass {
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        AddNumbers ad = new AddNumbers();
        int res=ad.add(num1,num2);
        System.out.println(res);
    }

}
