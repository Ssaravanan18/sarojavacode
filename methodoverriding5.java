//methodoverriding using private function()
import java.util.*;
class details
{
    private String n;
    private int a;
    details(String x,int y)
    {
        this.n=x;
        this.a=y;
    }
    public String getx()
    {
        return n;
    }
    public int gety()
    {
        return a;
    }
}
class some extends details
{
    private String g;
    some(String n,int a,String g)
    {
        super(n,a);
        this.g=g;
    }
    public String getg()
    {
        return g;
    }
    public void display()
    {
        System.out.println("Name:"+getx());
        System.out.println("Age:"+gety());
        System.out.println("Gender:"+getg());
    }
}
public class methodoverriding5
{
    public static void main(String args[])
    {
        some s=new some("Saravanan",19,"male");
        s.display();
    }
}