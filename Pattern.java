import java.util.Scanner;

public class Pattern {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=input.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>j)
                {
                    System.out.print(" ");

                }

                else{
                    System.out.print("*");

                }

            }
            System.out.print("\n");
 
        }
         input.close();
    }
    
}
