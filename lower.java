import java.util.*;
class lower
{
    public static void main(String args[])
    {
        StringBuilder a=new StringBuilder("ABC");
        System.out.println("Orginal string:" +a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=65 && a.charAt(i)<=90)
            {
                int c=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)c);
            }
        }
        System.out.println("Lowercase string:" +a);
    }
}