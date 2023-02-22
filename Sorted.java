import java.util.Scanner;
public class Sorted {

    public static void main(String args[])
    {
          
        Scanner input=new Scanner(System.in);

        System.out.println("Enter how many elements");
        int n=input.nextInt();
          
        
        int a[]=new int[n];
        

        System.out.println("Enter numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();

        }

        System.out.println("Numbers are");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");

        }

        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;



                }
            }
        }

        System.out.println("\nSorted array elements");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");

        }
        
         
        input.close();
    }
  


}
