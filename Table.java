public class Table {
    
    public static void main(String args[])
    {
        int tab; 

        System.out.println("2 to 10 tables");
        System.out.println("*****************************************");
        for(int i=2 ; i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                 tab=i*j;
                 //System.out.print(i+"*"+j+" = "+tab+ "  ");

                System.out.print(tab + "  ");
            }

            System.out.println(" ");
        }
    }
}
