interface  camera
{
   public void pic();

}

class smartphone implements camera{

    public void pic()
    {
        System.out.println("Clicking pictures");

    }
}

public class InterfaceEx {
    
    public static void main(String args[])
    {
        smartphone s=new smartphone();

        s.pic();

        camera c=new smartphone();
        c.pic();
        

    }
}
