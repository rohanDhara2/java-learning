package dhara;
/*
    In inheritance if we don't have .java file of super class that's ok. only we need the .class file .
    one class is inheriting another one class that is called single level inheritance.
    here calculator is extended by AdvanceCalculator and AdvanceCalculator is extended by MoreAdvanceCalculator, it is a multilevel inheritance.
 */
class Calculator{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
class AdvanceCalculator extends Calculator
{
    public int mult(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class MoreAdvanceCalculator extends AdvanceCalculator
{
    public double power(int n1,int n2)
    {
        return Math.pow(n1,n2); //Math.pow method returns a double value
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        MoreAdvanceCalculator vacal = new MoreAdvanceCalculator();
        int r1=vacal.add(5,8);
        int r2=vacal.sub(10,6);
        int r3=vacal.mult(10,6);
        int r4=vacal.div(10,6);
        double r5=vacal.power(2,8);
        System.out.println(r1+"\t"+r2+"\t"+r3+"\t"+r4+"\t"+r5);
    }
}
