import java.util.*;
public class returnarray
{
    public static int[] king()
    {
        return new int[]{1,2,3,4,5};
    }
}
public static void main(String args[])
{
    int arr[] =king();
    for(int a:arr)
    {
        System.out.println("" +a);
    }
}