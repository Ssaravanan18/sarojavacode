//string buffer and string builder
/*the different between these two are (the String buffer are handeling thread )
 * (the string builder does not handling the thread) and both are same function except thread handling
*/
import java.util.*;
class stringbuffer
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer(" saravanan ");
        System.out.println(sb);
        sb.append(" hacker ");
        System.out.println(sb);
        sb.insert(10," master ");
        System.out.println(sb);
        sb.delete(11,17);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println("substring :"+sb.substring(2,5));
        System.out.println("each character:" +sb.charAt(5));
        StringBuffer sk=new StringBuffer("universe");
        sk.setCharAt(5,'#');
        System.out.println(sk);

    }

}
