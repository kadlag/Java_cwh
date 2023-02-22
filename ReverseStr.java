import java.util.Scanner;
public class ReverseStr {
    
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

       // String name="I am the Best";

       System.out.println("Enter String");

       String name=input.nextLine();


        System.out.println("name:"+name);

        int length=name.length();

        System.out.println("Length is :"+length);

        int space=name.lastIndexOf(" ");

        System.out.println("Space:"+space);

        for(int i=0;i<space;i++)
        {
            System.out.print(name.charAt(i));

        }
        System.out.print(" ");
        
        for(int i=length-1;i>space;i--)
        {
            System.out.print(name.charAt(i));
        }


       // System.out.println(name.reverse());

        input.close();

    }
}
