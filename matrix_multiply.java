import java.util.*;
class matrix
{
    public static void main(String args[])
    {
        int row1,col1,row2,col2;
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter the no: of rows of first matix");
         row1=myscanner.nextInt();
        System.out.println("Enter the no: of coloumns of second matrix");
        col1=myscanner.nextInt();
        System.out.println("Enter the no: of rows of second matrix");
        row2=myscanner.nextInt();
        System.out.println("Enter the no: of coloums of second matix");
         col2=myscanner.nextInt();
        if( row1 != col2)
        {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int a[][]=new int[row1][col1];
        int b[][]=new int[row2][col2];
        int c[][]=new int[row1][col2];
        System.out.println("Enter the elements of first matirx");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                a[i][j]=myscanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                b[i][j]=myscanner.nextInt();
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<col1;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The elements after matrix calculation are:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.println(" "+ c[i][j]);
            }
        }
        
    }
}
