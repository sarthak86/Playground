import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      Pattern ptn = Pattern.compile("(,| |and|or)");
      String[] a = ptn.split(s);
      for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}