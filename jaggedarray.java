import java.util.*;
class jaggedarray
{
    public static void main(String args[])
    {
        int s[][]={{1,2,3,4},{5,6,7},{1,9,10,5,3,2}};
        System.out.println("THE ARRAY IS:");
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length;j++)
            {
                System.out.print(" "+s[i][j]);
            }
            System.out.println(" ");
        }
    }
}