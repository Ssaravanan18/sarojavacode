import java.util.*;
class orange extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
        System.out.println("The color is beautiful");
        }
        try
        {
        Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
        }
    }
}
class green extends  Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
        try
        {
        Thread.sleep(8000);
        }
        catch(InterruptedException e)
        {
        }
    }
}
public class multithread 
{
    public static void main(String args[])
    {
        orange o=new orange();
        green g=new green();
        o.start();
        g.start();
    }
}