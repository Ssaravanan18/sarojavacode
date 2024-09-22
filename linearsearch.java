import java.util.*;
class linearsearch
{
    public static void main(String args[])
    {
        int array[]={2,5,8,27,0,45,34};
        int target=55;
        int result=linear(array,target);
        if(result ==-1)
            {
                System.out.println("Number is not found" );
            }
            else
            {
                System.out.println("Number is not found " +result);
            }
    }
    public static int linear(int [] array,int target)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==target)
            return i;
        }
        return -1;
    }
}