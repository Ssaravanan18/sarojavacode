import java.util.*;
class bin
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+"can be fit");
                if(x>=Byte.MIN_VALUE&& x<=Byte.MAX_VALUE);
                System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE);
                System.out.println("* Short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE);
                System.out.println("* integer");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE);
                System.out.println("* Long");
            }
            catch (Exception e)
            {
                System.out.println(sc.next()+"can not be fit");
            }
        }
    }
}