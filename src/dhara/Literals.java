package dhara;

public class Literals {
    public static void main(String[] args) {
        //Literals

        int score1 = 0b111; // we can store binary numbers like this, 0b is specifying that it a binary number and 111 is value in binary
//        System.out.println(score1);

        int score2 = 0x5A; // we can store hexadecimal numbers like this, 0x is specifying that it a hexadecimal number and 5A is value
//        System.out.println(score2);

        int score3 = 10_00_00_000; // to understand 0's we can put _ in between no problem.
//        System.out.println(score3);

        char c ='a'; // these are called literals
        c++;
        System.out.println(c);

    }
}
