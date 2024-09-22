//user definr value bu Scanner
import java.util.*;
class scanner
{
    public static void main(String args[])
    {
        int age;
        String name;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=in.next();
        System.out.println("Enter the age:");
        age=in.nextInt();
        System.out.println("NAME:" +name);
        System.out.println("AGE:" +age);
    }
}