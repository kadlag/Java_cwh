class circle
{
    double radius;

    circle(int r)
    {
         this.radius=r;

        
    }


    double area()
    {
        return 3.14*this.radius*this.radius;
    }


}


class cylinder extends circle
{
    int r;
    int h;
    cylinder(int r,int h)
    {
        super(r);
        this.r=r;
        this.h=h;

       
    }

    double volume()
    {
        return 3.14*this.r*this.r*this.h;
    }
}

public class InheritanceExercise {
    
    public static void main(String args[])
    {
        cylinder  c1=new cylinder(10,20);

       double v= c1.volume();
       System.out.println(v);
        c1.area();

    

    }
   
}
