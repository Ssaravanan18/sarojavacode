import java.util.*;
import java.io.*;
class shorting
{
    public static void main(String args[])
    {
        int temp=0;
        Scanner sc =new Scanner(System.in);
        int num[]=new int[100];
        System.out.println("Enter how many numbers want to short:");
        int n=sc.nextInt();
        System.out.println("Enter the number:");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("-----------------------------------------------------");
            for(int i=0;i<=n;i++)
            {
                if(num[i]>num[i+1])
                {
                temp=num[i];
                num[i]=num[i+1];
                num[i+1]=temp;
                i++;
                }
                
            System.out.println(num[i]);
            }
    }
}
