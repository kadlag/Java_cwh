import java.util.Scanner;
public class Replace {

    public static void main(String args[])
    {
        //String name= "a b c";

        Scanner input=new Scanner(System.in);

        // String name="I am the Best";
 
        System.out.println("Enter String");
 
        String name=input.nextLine();
 
        int length=name.length();

        System.out.println(length);

        for(int i=0;i<length;i++)
        {
           // System.out.print(name.charAt(i));
            if(name.charAt(i)==' ')
            {
                System.out.print("%");


            }

            else{
                System.out.print(name.charAt(i));
            }
        }

       // name=name.replace(" ","%");

      // System.out.println(name.substring(0,1)+ "%"+name.substring(2, 3)+"%"+name.substring(4, 5));

        //System.out.println(name);

        
        input.close();
    }
    
}
