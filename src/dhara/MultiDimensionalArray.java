package dhara;

public class MultiDimensionalArray {
    public static void main(String[] args)
    {
        int[][] carNumber = new int[4][4];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                carNumber[i][j] = (int)(Math.random() * 10);
            }
        }

//if we don't assign any values to array it will contain all 0's

        // accessing by normal for loop
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(carNumber[i][j] + " ");
            }
            System.out.println();
        }

        // accessing by enhanced for loop
        for(int n[]:carNumber)
        {
            for(int m : n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

}
