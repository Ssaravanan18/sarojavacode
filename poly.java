import java.util.*;
class poly
{
    public static void main(String args[])
    {
        System.out.println("Enter your name:");
        Scanner sc =new Scanner(System.in);
        String name;
        int p,c,m;
        name=sc.next();
        System.out.println(name+" Enter your mark:");
        System.out.println("Enter your physics mark:");
        p=sc.nextInt();
        System.out.println("Enter your chemistry mark:");
        c=sc.nextInt();
        System.out.println("Enter your maths mark:");
        m=sc.nextInt();
        int mark,f;
        f=(p+c)/2;
        mark=f+m;
        System.out.println(name+" your cutoff is: "+mark);
    }
}