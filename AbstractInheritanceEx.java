
abstract class cellphone{

   abstract void call();
   abstract void msg();


}

class smartphone extends cellphone
{

    void call()
    {
        System.out.println("Calling Information");

    }

    void msg()
    {
        System.out.println("message Information");
    }
}

public class AbstractInheritanceEx {
    public static void main(String args[])
    {
        smartphone s=new smartphone();

        s.call();
        s.msg();

    }
    
}
