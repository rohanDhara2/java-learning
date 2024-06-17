package dhara;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        int num=0;
        try(BufferedReader bd = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(bd.readLine());
            System.out.println("Bye");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        //finally block is always used to close the resources and for preventing data leakage
        finally {
            System.out.println("from finally");
        }
    }
}
