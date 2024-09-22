//not use getter setter method
import java.util.*;
class pythagoras
{
    private int a,b;

    void value(int x,int y)
    {
        a=x;
        b=y;
    }
    int calculation()
    {
        int c=a+b;
        return c;
    }
}
public class getsetmethod
{
    public static void main(String args[])
    {
        pythagoras py=new pythagoras();
        py.value(10,12);
        System.out.println("The value is:" +py.calculation());
    }
}