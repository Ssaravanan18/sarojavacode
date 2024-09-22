//lower case to uppercase using code only
import java.util.*;
class upper
{
    public static void main(String args[])
    {
        StringBuilder a=new StringBuilder("abc");
        System.out.println("Orginal string:" +a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=97 && a.charAt(i)<=122)
            {
                int c=((int)a.charAt(i)-32);
                a.setCharAt(i,(char)c);
            }
        }
        System.out.println("Capital string:"+a);
    }
}
