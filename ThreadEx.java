class Mythread1 extends Thread {

    public void run() {
        int i=1;
        while (i<4000) {
            System.out.println("Cooking");
            System.out.println("Happy");
         i++;
        }

    }
}

class Mythread2 extends Thread {

    public void run()

    {
        int i=1;

        while (i < 4000) {
            System.out.println("Watching movie");
            System.out.println("eating");

            i++;
        }

    }
}

public class ThreadEx {

    public static void main(String args[]) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();

        t1.start();
        t2.start();

    }
}
