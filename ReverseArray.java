import java.util.Scanner;
public class ReverseArray {

    public static void main(String args[])
    {
          
        Scanner input=new Scanner(System.in);

        System.out.println("Enter how many elements");
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


        System.out.println("\nReverse Elements are:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);

        }
        input.close();

    }
}
