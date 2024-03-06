package dhara;
/*
    As Strings are immutable in java, so we cannot change the value of a string, it is constant.
    in line no 10 we are not changing the value of myName. we are creating another object and assigning the address
    of it to myName.
 */
public class StringTwo {
    public static void main(String[] args) {
        //this line will create the object inside String constant pool not in heap though the string constant pool is a part of heap
        String myName = "Rohan";
        myName = myName+" Dhara";

        System.out.println(myName);

        String s1 = "messi";
        String s2 = "messi"; // it will not create two object with same value but create one object and assign s1 and s2 the same address

        System.out.println(s1 == s2); // this will give true as s1 and s2 are holding the same address
        //thus == checks for address and value then gives output as true or false.
        //.equals only checks value not the addresses
    }
}
