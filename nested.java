import java.util.*;
class comperation
{
    int a,b;
    void values(int x,int y)
    {
        this.a=x;
        this.b=y;
    }
    int largest()     //this is one of the function ,this function used below
    {
        if(a>b)
        return a;
        else
        return b;
    }
    void display()
    {
        int large=largest();  //the above largest function are used in the display function in the same class so is called nested 
        System.out.println("The Largest value:"+large);
    }
}
public class nested
{
    public static void main(String args[])
    {
        comperation c=new comperation();
        c.values(5,8);
        c.display();
    }
}