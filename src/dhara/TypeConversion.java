package dhara;
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        //int i = 256;
        int i = 12;

        b=(byte)i; //explicit conversion when a bigger range datatype stores smaller range of same type it will convert it automatically
        // this cannot be done, byte has smaller range than int, so it cannot hold 256. After making, its value to 12 now can typecast it and also b can hold it.
        i=b; // it will convert automatically that's why this conversion is called implicit conversion.

        int x = 258 ;
        byte y = (byte)x;
        //258 % 256 = 2(remainder)
        System.out.println(y); //in this case if byte value goes up from its range then it performs mod with 256 and results the remainder

        float ft = 9.8f;
        int z = (int)ft; //it will only contain values before . decimal point

        //type promotion

        byte bt = 10;
        byte tb = 50;
        //if we multiply value will go out of range for that case java provides type promotion now we can store it in integer variable
        int result = bt*tb;

        System.out.println(result);

    }
}
