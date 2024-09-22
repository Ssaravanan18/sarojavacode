//String concepts its immutable means cannot change the value
import java.util.*;
class stringconcept
{
    public static void main(String args[])
    {
        String a="SARAVANAN";
        String b="saravanan";
        String c="saravanan";
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        System.out.println(" A equal to B:" +a.equals(b));
        System.out.println("B equal to C:" +b.equals(c));
        System.out.println("A hashcode:" +a.hashCode());
        System.out.println("B hashcode" +b.hashCode());
        System.out.println("C hashcode" +c.hashCode());
        System.out.println("A equal to b:" +a.equalsIgnoreCase(b));
        System.out.println("THE length of A:" +a.length());
        System.out.println("single value :" +a.charAt(4));
        System.out.println("the upper case of A:" +a.toUpperCase());
        System.out.println("the lower case of A:" +a.toLowerCase());
        System.out.println("The substring of A :" +a.substring(0));
        System.out.println("The substring of A :" +a.substring(3,6));
        System.out.println(" A Is empty:" +a.isEmpty());
        System.out.println("A contains:" +a.contains("NAN"));
        System.out.println("B contains:" +b.contains("saravanan"));
        System.out.println("A endWith:" +a.endsWith("AN"));
        System.out.println("A startsWith:" +a.startsWith("SAR"));
        System.out.println("A replace:" +a.replace("SARAVANAN","saro"));
        System.out.println("A trim:" +a.trim());
        System.out.println("A trim length:" +a.trim().length());



        
        

    }
}
