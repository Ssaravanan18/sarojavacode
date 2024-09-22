import java.util.*;
abstract class demo 
{
    abstract void message();
    void display()
    {
        System.out.println("Hello");
    }
}
class work extends demo
{
    void message()
    {
        System.out.println("World");
    }
}
public class aabstract
{
    public static void main(String args[])
    {
        work w=new work();
        w.display();
        w.message();
    }
}