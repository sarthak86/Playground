import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    private static Pattern userNamePattern = Pattern.compile("[a-zA-Z0-9_-]*$");
    public static boolean validateUserName(String userName){
        Matcher match = userNamePattern.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    }
   private static Pattern emailNamePattern = Pattern.compile( "^[a-z0-9._@]*$");
    public static boolean validateEmailAddress(String userName){
        Matcher match = emailNamePattern.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    }
private static Pattern pswNamePattern = Pattern.compile("^[a-zA-Z@#$%0-9]*$");
    public static boolean validatePassword(String userName){
        Matcher match = pswNamePattern.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    }
    public static void main(String a[]){
         
         Scanner sc = new Scanner(System.in);
         String user_name = sc.nextLine();  
         String email_id = sc.nextLine();
         String password = sc.nextLine();
         
        System.out.println("Is "+ user_name+" a valid user name? " +validateUserName(user_name));
       System.out.println("Is " +email_id+ " a valid email address? "+validateEmailAddress(email_id));
       System.out.println("Is " +password +" a valid password? " +validatePassword(password));
    }
}