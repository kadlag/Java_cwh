import java.util.Scanner;
public class Star {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");

            }

            System.out.print("\n");
            

        }

        input.close();

    }
    
}
