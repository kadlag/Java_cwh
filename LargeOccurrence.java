import java.util.Scanner;

public class LargeOccurrence {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter a string");
        String name = input.nextLine();

        System.out.println("String:"+name);

        int length=name.length();

        //System.out.println(length);
        
        int max=0;
        char ch=' ';

        int count;


        for(int i=0;i<length;i++)
        {

            count=0;

            for(int j=0;j<length;j++)
            {
                if(name.charAt(i)==name.charAt(j))
                {
                    count++;

                }
            }
            

            if(max<count)
            {
                max=count;
                ch=name.charAt(i);

            }
        }

        System.out.println("maximum character occuring :"+ch);

        input.close();
    }
}