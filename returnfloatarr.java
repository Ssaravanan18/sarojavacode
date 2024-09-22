import java.util.*;
class returnfloatarr
{
    public static String[]  floatarray()
    {
       return new String[]{"s","a","r","a","v","a","n","a","n"};
       //(or)
       // return new String[]{"saravanan"};
    }
    public static void main(String args[])
    {
        String arr[]=floatarray();
        {
            for(String a:arr)
            {
                System.out.println(" "+a);
            }
        }
    }
}