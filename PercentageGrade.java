import java.util.Scanner;
public class PercentageGrade {
public static void main(String args[])
{
     Scanner input=new Scanner(System.in);

     System.out.println("Enter the name of the Student");
     String name=input.nextLine();

     System.out.println("Enter the marks of physics");
     int physics=input.nextInt();

     System.out.println("Enter the marks of Chemistry");
     int chemistry=input.nextInt();

     System.out.println("Enter the marks of Biology");
     int bio=input.nextInt();

     System.out.println("Enter the marks of mathematics");
     int math=input.nextInt();

     System.out.println("Enter the marks of english");
     int english=input.nextInt();

     int total=physics+chemistry+bio+math+english;

     System.out.println("Total Marks:"+total);

     float per=(float)(total*100)/500;

     System.out.println("Percentage:"+per);
       
     String grade;


     System.out.println("***************** Result*************");
     System.out.println("Name\t\t\tTotal\tPercentage\tGrade" );

     if(per>=75)
     {
        grade="Distinction";
        System.out.println(name + "\t"+ total + "\t"+ per + "\t\t"+  grade );
     }

     else if(per>=60 && per<75)
     {
        grade="First class";
        System.out.println(name + "\t"+ total + "\t"+ per + "\t\t"+  grade );
     }

     else if(per>=40 && per<60)
     {
        grade="Second  class";
        System.out.println(name + "\t"+ total + "\t"+ per + "\t\t"+  grade );
     }

     else if(per>=35 && per<40)
     {
        grade="Pass";
        System.out.println(name + "\t"+ total + "\t"+ per + "\t\t"+  grade );
     }

     else 
     {

        grade="Fail";
        System.out.println(name + "\t"+ total + "\t"+ per + "\t"+  grade );
     }
     input.close();






}
    
}
