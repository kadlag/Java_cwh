import java.util.Scanner;

public class Unique_number {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter  a number");
        int n=input.nextInt();

        int a[]=new int[n];
        

        System.out.println("Enter numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();

        }

        System.out.println("Numbers are");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");

        }

        int count;
        
        System.out.println("\nUnique number is:");
         for(int i=0;i<n;i++)
         {
            count=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==a[i])
                {
                    count++;


                }
            }

            if(count==1)
            {
                System.out.println(a[i]);

            }
         }
        input.close();

    }
}
