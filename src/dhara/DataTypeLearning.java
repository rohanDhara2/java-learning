package dhara;
/*
    There are two categories of datatype in java
    1.Primitive 2. Non-Primitive
    1.Primitive --->> Integer(byte,short,int,long),Float(float,double),Character(char),Boolean(boolean) etc .
    int has default value 0 and double has 0.0
    default value of boolean in java is false
    2.Non-Primitive --->> String,Array,Object,Interface etc.

 */
public class DataTypeLearning{
    public static void main(String[] args) {

        byte bt = 127;  // 1 byte
        short sh = 32767; // 2 byte
        int i = 2147483647; // 4 byte
        long l = 9223372036854775807l; // 8 byte

        float ft = 12.72F; //4 bytes
        double d = 78.1245; // 8 bytes in java default is double not float

        char c= 'a';

        boolean bl = true;

    }
}