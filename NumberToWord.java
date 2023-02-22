import java.util.Scanner;
public class NumberToWord {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");

        int n=input.nextInt();

        System.out.println(n);

        int r;
        int rev=0;

        while(n>0)
        {
            r=n%10; //remainder
            rev=rev*10+r;
            n=n/10;

        }

        System.out.println("Reverse:"+rev);

       int num;

        while(rev>0)
        {
           num=rev%10;

           switch(num)
           {
            case 0: System.out.print("Zero \t");
                    break;

            case 1: System.out.print("One\t");
                    break;
            
            case 2: System.out.print("Two\t");
                    break;

            case 3: System.out.print("Three\t");
                    break;

            case 4: System.out.print("Four\t");
                    break;

            case 5: System.out.print("Five\t");
                    break;

            case 6: System.out.print("Six\t");
                    break;
                
            case 7: System.out.print("Seven\t");
                    break;

            case 8: System.out.print("Eight\t");
                    break;

             case 9: System.out.print("Nine\t");
                    break;
                
             default:System.out.print("Exit");


            }

            rev=rev/10;


        }

        input.close();
        
    }
    
}
