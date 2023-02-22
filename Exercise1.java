import java.util.Scanner;
public class Exercise1 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the marks of physics");
        int physics=input.nextInt();

        System.out.println("Enter the marks of chemistry");
        int chemistry=input.nextInt();

        System.out.println("Enter the marks of Bio");
        int bio=input.nextInt();

        System.out.println("Enter the marks of Math");
        int math=input.nextInt();

        System.out.println("Enter the marks of English");
        int english=input.nextInt();


        int total=physics+chemistry+bio+math+english;

        System.out.println(total);

        float per=(total*100)/500;

        System.out.println("Percentage is:"+per);

        input.close();
        

        }
}
