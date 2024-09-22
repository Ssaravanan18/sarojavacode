import java.util.*;
class decimal_binary
{
    public static void dec_bin (int n)
    {
        int dec[]=new int[1000];
        int i=0;
        while(n>0)
        {
            dec[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.println("Decimal number" +dec[j]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n=sc.nextInt();
        System.out.println("Decimal number:" +n);
        dec_bin(n);
    }
}