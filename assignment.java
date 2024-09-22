//assignment opperation
import java.util.*;
class assignment
{
    public static void main(String args[])
    {
        int a=25,b=20;
        System.out.println("the A value is:"+a);
        //incremented by 10
        System.out.println("after the A value is:"+(a+=10));
        System.out.println("the B value is :"+b);
        //incremented by 10
        System.out.println("after the B value is:"+(b+=10));
        //unary opperation
        System.out.println("the urinary operation of A is:"+(a++));
        System.out.println("the urinary operation of B is:"+(b++));
        //after you print a then only you can see the change
        System.out.println(a);
        System.out.println(b);
    }
}
