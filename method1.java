//method function using user define
import java.util.*;
class method1
{
    public static void main(String args[])
    {
        Scanner gg=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER BETWEEN 1 to 10:");
        int n=gg.nextInt();
        if(n>0 && n<=10)
        {
        kk(n);
        }
        else
        {
            System.out.println("please enter the number betwee 1 to 10");
        }
    }
    public static void kk(int n)
    {
        if(n==1)
        {
            System.out.println("THE NUMBER IS:" +n );
        }
        else
        {
            System.out.println("THE NUMBER IS:"+n);
            kk(n-1);
        }
    }
}
