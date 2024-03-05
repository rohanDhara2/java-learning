package dhara;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] myArray = new int[3][]; //jagged array
        //int[][][] myThreeDArray = new int[6][5][4]; //3-D array
        myArray[0]=new int[4];
        myArray[1]=new int[2];
        myArray[2]=new int[3];

        for(int i=0;i<myArray.length;i++)
        {
            for (int j=0;j<myArray[i].length;j++){
                myArray[i][j]=(int)(Math.random()*10 + 1);
            }
        }

        for (int n[]: myArray)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
