import java.util.Scanner;
public class Addition {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("enter number of rows");
        int rows=input.nextInt();

        System.out.println("enter number of columns");
        int columns=input.nextInt();

        int a[][]=new int[rows][columns];
        int b[][]=new int[rows][columns];
        int add[][]=new int[rows][columns];


        System.out.println("Enter the element of first array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                a[i][j]=input.nextInt();

            }
        }


        System.out.println("Enter the element of srecond  array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                b[i][j]=input.nextInt();
                
            }
        }

        System.out.println("First matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(a[i][j]+"\t");
                
            }
            System.out.println("\n");

        }

        System.out.println("Second matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(b[i][j]+"\t");
                
            }
            System.out.println("\n");

        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                add[i][j]=a[i][j]+b[i][j];

            }
        }

        System.out.println("Addition of two  matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(add[i][j]+"\t");
                
            }
            System.out.println("\n");

        }

         input.close();





    }
    
}
