class Mythread1 implements Runnable{

    public void run()
    {
        System.out.println("Runnable1");
        System.out.println("Runnable1");
        System.out.println("Runnable1");
        System.out.println("Runnable1");
        System.out.println("Runnable1");
        System.out.println("Runnable1");
        


    }
}

class Mythread2 implements Runnable{

    public void run()
    {
        System.out.println("Runnable2");
        System.out.println("Runnable2");
        System.out.println("Runnable2");
        System.out.println("Runnable2");
        System.out.println("Runnable2");
        System.out.println("Runnable2");
        


    }
}

public class ThreadRunn {
    
    public static void main(String args[])
    {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();

        Thread tt1=new Thread(t1);
        Thread tt2=new Thread(t2);

        tt1.start();
        tt2.start();
        

    }
}
