import java.util.Scanner;

public class ArrayDemo {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter  a number");
        int n=input.nextInt();

        int marks[]=new int[n];
        

        System.out.println("Enter numbers");
        for(int i=0;i<n;i++)
        {
            marks[i]=input.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(marks[i]);

        }


        input.close();

    }
}
