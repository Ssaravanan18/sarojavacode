import java.util.*;
import java.io.*;
class charfinder
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("saravanan");
        String str=sb.toString();
        char a[]={'s','a','v','n'};    //sav
        char arr[]=str.toCharArray();   //saravanan
        int count=sb.length();
        int cot =a.length;
        //System.out.println(+count);
        int k=0;
        for(int i=0;i<=count-1;i++)
        {
            for(int j=0;j<=cot-1;j++)
            {
                if(arr[i]==a[j])
                k++;
            }
        }
        System.out.println("The value is: " +k);
    }
}