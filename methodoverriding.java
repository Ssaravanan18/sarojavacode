// method over riding method
import java.util.*;
class user
{
    String name;
    int age;
    String place;
    user(String n,int a,String p)
    {
        this.name=n;
        this.age=a;
        this.place=p;
    }
}
class customer extends user
{
    String gender;
    customer(String n,int a,String p,String g)
    {
        super(n,a,p);
        this.gender=g;
    }
    public void display()
    {
        System.out.println("NAME:" +name);
        System.out.println("AGE:" +age);
        System.out.println("PLACE:" +place);
        System.out.println("GENDER:" +gender);
    }
}
public class methodoverriding
{
    public static void main(String args[])
    {
        customer j =new customer ("SARAVANAN.S",19,"theni","male");
        j.display();
    }
}