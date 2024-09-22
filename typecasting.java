//type casting operation
import java.util.*;
class typecasting
{
    public static void main(String args[])
    {
        int a=22;
        double b=a;
        /*in this step is called small memory value to higher memory value
        Byte-> Short-> Char-> int-> long-> float-> double */
        System.out.println("int of A:" +a);
        System.out.println("double of A:" +b);
        /* in this step is called bigger memory value to smaller memory value
         double-> float-> long-> int-> char-> short->Byte */
         double g=8.0400;
         int v=(int)g;
         System.out.println("the double of G:" +g);
         System.out.println("the int of G:" +v);
    }
}
