// class and object
import java.util.*;
class std_cutoff
{
    int phy,che,mat;
    void  mark(int x,int y,int z)
    {
        phy=x;
        che=y;
        mat=z;
    }
    float value()
    {
        float a=(phy+che)/2;
        float b=a+mat;
        return b;
    }
}
public class student
{
    public static void main(String args[])
    {
        std_cutoff sc =new std_cutoff();
        sc.phy=55;
        sc.che=67;
        sc.mat=77;
        System.out.println("The Student Cutoff: "+ sc.value());

        std_cutoff sc1=new std_cutoff();
        sc1.mark(50,50,50);
        System.out.println("The Student Cutoff:  "+ sc1.value());
    }
}