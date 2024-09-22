import java.util.*;
class cse1
{
    String name1;
    int age1;
    char gender1;
    cse1(String n,int a,char g)
    {
        this.name1=n;
        this.age1=a;
        this.gender1=g;
    }
}
class cse2 extends cse1
{
    String name2;
    int age2;
    char gender2;
    cse2(String n,int a,char g,String x,int y,char z)
    {
    super(n,a,g);
    this.name2=x;
    this.age2=y;
    this.gender2=z;
    }
    public void display()
    {
        System.out.println("NAME 1:"+name1);
        System.out.println("AGE1:"+age1);
        System.out.println("GENDER1:"+gender1);
        System.out.println("NAME2:"+name2);
        System.out.println("AGE2:"+age2);
        System.out.println("GENDER2:"+gender2);
    }
}
public class methodoverriding4
{
    public static void main(String args[])
    {
        cse2 cs=new cse2 ("saravanan",19,'m',"siva",23,'f');
        cs.display();
    }
}