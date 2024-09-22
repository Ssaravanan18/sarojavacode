import java.util.*;
class bubbleshort
{
    public static void main(String args[])
    {
       int num[]={8,4,2,1,7,3,9};
        int temp=0;
        int size=num.length;
        System.out.println("Before Short");
        for(int n:num)
        {
            System.out.print(n+" ");
        }
        for(int i=0;i<=size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Short");
        for(int a:num)
        {
        System.out.print(a+" " );
        }
    }
}
