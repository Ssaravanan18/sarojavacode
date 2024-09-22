import java.util.*;
class binarysearch
{
    public static void main(String args[])
    {
        int mid=0;
        int s=0;
        int e=0;
        int target=2;
        int[] array={1,2,3,4,5,6,7,8,9};
        s=array[0];
        e=array.length-1;
        mid=(s+e)/2;
        if(array[mid]==target)
        {
            System.out.println("Element is found");
        }
        else if(array[mid]>target)
        {
            s=array[0];
            e=array[mid-1];
            mid=(s+e)/2;
        if(array[mid]==target)
        {
            System.out.println("Element is found");
        }
        }
        else if(array[mid]<target)
        {
            s=array[mid+1];
            e=array.length-1;
            mid=(s+e)/2;
        if(array[mid]==target)
        {
            
            System.out.println("Element is found");
        }
        }
        
        System.out.println("Element is not found");
    }
}