import java.util.*;
class linearsearch1
{
    public static void main(String args[])
    {
        int target;
        int n;
        System.out.println("Enter how many number want to insert:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the Number:");
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();   
        }
        System.out.println("Enter the target value:");
        target=sc.nextInt();
        int result=linearsearch(array,target);
        if(result==-1)
        {
            System.out.println("Elemente is not found");
        }
        else
        {
            System.out.println("Element is found "+result);
        }
    }
    public static int linearsearch(int[] array,int target)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
