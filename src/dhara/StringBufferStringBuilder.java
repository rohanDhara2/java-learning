package dhara;
/*
    In java String are Immutable however we can make it mutable by using
    StringBuffer and StringBuilder.StringBuffer gives us a buffer of size 16.If we add elements size will increase.
    The major difference is stringBuffer is Thread safe and StringBuilder is not Thread safe.
    There is another class called StringTokenizer inside util package study about that also

 */
public class StringBufferStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Rohan");
        System.out.println(sb.capacity()); // 16 + 5 (length of Rohan)
        sb.append(" Dhara");
        System.out.println(sb);
       // System.out.println(sb.reverse());
        System.out.println(sb.insert(6,"College "));

        //String name = sb; //StringBuffer cannot be assigned to String directly we have to convert it to string one of the way is using .toString() method
        String name = sb.toString();
        System.out.println(name);
        sb.ensureCapacity(100); //we can set minimum capacity using this method
    }
}
