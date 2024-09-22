//jagged array using enhanced for loop concept
import java.util.*;
class jaggedarray1
{
    public static void main(String args[])
    {
        int s[][]={{1,2,3,4,5},{2,4,7},{10,23,45,67,23,55,77,32},{2},{45,7}};
        System.out.println("JAGGED ARRAY USING Enhance for loop concept:");
        for(int a[]:s)
        {
            for(int g:a)
            {
                System.out.print(" "+g);
            }
            System.out.println("");
        }
    }
}  
