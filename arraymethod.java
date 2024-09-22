import java.util.*;
class multiply
{
    public int n1,n2;
     multiply(int x,int y)
    {
        this.n1=x;
        this.n2=y;
    }
    void display()
    {
        System.out.println("The multiply number is:"+(n1*n2));
    }
}
public class arraymethod
{
    public static void main(String args[])
    {
        multiply[] m=new multiply[10];
            m[1]=new multiply(1,2);
            m[2]=new multiply(3,5);
            m[3]=new multiply(2,6);
            m[4]=new multiply(4,7);
        for(int i=0;i<=4;i++)
        {
            m[i].display();
        }
    }
}