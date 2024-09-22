import java.util.*;
class rectangle
{
    int length,width;

    void getdetails(int x,int y)
    {
        length=x;
        width=y;
    }
     int area()
     {
        int a=length*width;
        return a;
     }
}
public class features
{
    public static void main(String args[])
    {
        rectangle r= new rectangle();
       // r.getdetails(12,33);
       r.length=10;
       r.width=20;
        System.out.println("Area"+r.area());
    }
}