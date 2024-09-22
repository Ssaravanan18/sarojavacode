import java.util.*;
class binarysearch1
{
    public static void main(String args[])
    {
        int n;
        int target;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number are enter in array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        System.out.println("Enter the target value:");
        target=sc.nextInt();
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                System.out.println("The Number is found");
                System.exit(0);
            }
            else if(arr[mid]>target)
            {
                low=low;
                high=mid-1;
            }
            else
            {
                low=mid+1;
                high=high;
            }
        }
        System.out.println("Element is not found");
    }
}
