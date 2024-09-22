import java.util.*;
class maths
{
    private int length,width;
     
    void setlength(int x)
    {
        length=x;
    }
    int getlength()
    {
        return length;
    }
    void setwidth(int y)
    {
        width=y;
    }
    int getwidth()
    {
        return width;
    }
    int area()
    {
        int value=length*width;
        return value;
    }
}
public class getsetmethod1