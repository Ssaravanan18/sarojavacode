//string function used to print array format
import java.util.*;
class stringtoarray
{
    public static void main(String args[])
    {
        String s="saravanan";
        char[] caraay=s.toCharArray();
        for(char c:caraay)
        {
            System.out.println(" "+c);    
        }
        System.out.println(" ");
        System.out.println(" "+s);
    }
}