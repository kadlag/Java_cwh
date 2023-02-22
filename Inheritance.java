class base {
    int id;
    String name;
    int salary;


    base()
    {
      
        salary=1000;

    }
    void setdata() {
        id = 101;
        name = "sakshi";

    }

}

class derived extends base {


     derived()
     {
        System.out.println(salary);
     }

    void display() {

        int id=10;

        System.out.println(id);
       // System.out.println(super.id);

       System.out.println(name);



        //super.setdata();


    }
}

public class Inheritance {

    public static void main(String args[]) {
        derived d1 = new derived();

        d1.setdata();
        d1.display();

    }

}
