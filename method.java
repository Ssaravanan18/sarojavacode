//methods function
import java.util.*;
class method
{
    public static void main(String args[])
    {
        add(5,10);
        k(10);
    }
    public static void add(int a, int b)
    {
        int c=a+b;
        System.out.println("THE ADD VALUES IS:" +c);
    }
    public static void k(int n)
    {
        if(n==1)
        {
            System.out.println("the number is:" +n);
        }
        else
        {
            System.out.println("the number is:" +n);
            k(n-1);
        }
    }
}