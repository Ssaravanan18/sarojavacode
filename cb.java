//continue & break function()
import java.util.*;
/*class cb
{
    public static void main(String args[])
    {
        System.out.println("Enter the number greater than 10 and lesser than 20:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            if(i==7)
            {
                continue;                 //continue means the given paticular condition only are not execuite          
            }
            System.out.println("The value is: "+i);
        }
    }
}*/
class cb
{
    public static void main(String args[])
    {
        System.out.println("Enter the number greater than 10 and lesser than 20:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {                                         //if break means if code was break and out of the loop                         
            if(i==7) //(or) if(i>=10)
            {
                break;
            }
            System.out.println("The value is: "+i);
        }
    }
}