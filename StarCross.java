import java.util.Scanner;
public class StarCross {
    public static void main(String args[])
    {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=input.nextInt();

        int k=n;

      
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if(i==j || j==k)
                {
                    System.out.print("*");

                }
                   
                // else if(i==k||i==j)
                // {  
                //     System.out.print("*");
                // }

                else
                {
                    System.out.print(" ");

                }
            }
             System.out.print("\n");
            k--;

        }



        for(int m=4;m<n;m++)
        {
            for(int p=1;p<n;p++)
            {
                if( p==k||m==p)
                {
                    System.out.print("*");
                }

                else
            {
                System.out.print(" ");

            }
            }

           
 }

        System.out.print("\n");
       for(int i=1;i<=n;i++)
       {
        System.out.print("*");

       }
        

        
        
        input.close();


    }
    
}
