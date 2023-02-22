import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=input.nextInt();

        int r;
        int sum=0;
        int cube;
        int num=n;
        while(n>0)
        {
            r=n%10;
            cube=r*r*r;
            sum=sum+cube;
            n=n/10;


        }

        if(sum==num)
        {
            System.out.println("Number is Armstrong");

        }

        else{

            System.out.println("Number is not Armstrong");
        }


        input.close();

    }
    
}
