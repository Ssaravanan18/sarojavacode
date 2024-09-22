import java.util.*;
class kgf
{
    private int mass,acceleration;
    void setmass(int x)
    {
        mass=x;
    }
    void setacceleration(int y)
    {
        acceleration=y;
    }
    int getmass()
    {
      return mass;
    }
    int getacceleration()
    {
        return acceleration;
    }
    int force()
    {
        int f=mass*acceleration;
        return f;
    }
}
public class getseter
{
    public static void main(String args[])
    {
        kgf d=new kgf();
        d.setmass(10);
        d.setacceleration(20);
        System.out.println("Force:"+d.force());

    }
}
