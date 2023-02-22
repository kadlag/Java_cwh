import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=input.nextInt();

        int num1=0;
        int num2=1;

        System.out.println("Fibonacci Series");
        
        System.out.print(num1 +"\t");
        System.out.print(num2+"\t");

        int num3;

        for(int i=2;i<num;i++)
        {
           num3=num2+num1;
           System.out.print(num3+"\t");

           num1=num2;
           num2=num3;



        }




        input.close();

    }
    
}
