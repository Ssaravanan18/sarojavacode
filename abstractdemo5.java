import java.util.*;
abstract class a
    {
        abstract void draw();
        void display()
        {
            System.out.println("Every thing is solved:");
        }
    }
class b extends a
{
    void draw()
    {
        System.out.println("SooN");
    }
}
public class abstractdemo5
{
    public static void main(String args[])
    {
        b j=new b();
        j.draw();
        j.display();

    }
}