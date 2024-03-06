package dhara;
/*

        Strings are written inside double quotes => ""
        Characters are written inside single quotes => ''
        In java String is not a primitive data type, it is a class.
        Strings are immutable in java.
 */
public class StringOne {
    public static void main(String[] args) {
        String myName = new String("Rohan"); //we can pass value to constructor for set the myName value like this.
        String myHouse = "Pinkvilla"; // it will also create an object behind the scene and point to pinkvilla.
        //concatenate
        System.out.println("my name is "+myName+" ");
        //methods
        System.out.println(myName.equals(myHouse)); // returns a boolen value after checking the strings are equal or not.
        System.out.println(myName.concat(" Dhara"));//concat with given string
        System.out.println(myName.charAt(2));//returns the character at specified index
        System.out.println(myName.hashCode());//generate hash code of the string
        System.out.println(myName.toCharArray()); //for making the string a character array
    }
}
