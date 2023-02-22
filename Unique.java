import java.util.Scanner;
public class Unique {

public static void main(String args[])
{
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter String");
    String  name=input.nextLine();

    int length=name.length();

     int count;

    for(int i=0;i<length;i++)
    {
        char ch=name.charAt(i);
        count=0;

        for(int j=0;j<length;j++)
        {
            if(name.charAt(j)==ch)
            {
                count=count+1;

            }
        }

        if(count==1)
        {
            System.out.print(ch);

        }

       // System.out.println(ch);
    }

   // System.out.println(length);











    input.close();

} 
    
}
