package dhara;
/*
    In method overriding if subclass's method signature is same with super class
    then subclass method will override the super class's method.This is called method overriding.

 */
class Desk
{
    public int canAdd(int n1,int n2){
        return n1+n2;
    }
}
class Notebook extends Desk
{
    public int canAdd(int n1,int n2) // same type same number of parameter needed to override
    {
        return n1+n2+1;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        int result = nb.canAdd(5,6);
        System.out.println(result);
    }
}
