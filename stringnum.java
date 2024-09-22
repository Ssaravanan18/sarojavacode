import java.util.*;
class stringnum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any string:");
        String s1 =sc.next();
        int n= sc.nextInt();
        System.out.printf("%-15s%03d%n",s1,n);

    }
}