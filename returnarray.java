import java.util.*;
public class returnarray
{
    public static int[] senderarray()
    {
        return new int[]{1,2,3,4,5};
    }
public static void main(String args[])
{
    int arr[]=senderarray();
    for(int a:arr)
    {

        System.out.println("" +a);   
    }
}
}