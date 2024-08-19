import java.util.*;
public class palindrom 
{
    public static boolean  palindrom(int n){
        boolean result=false;
        int org=n;
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(org==rev){
            result=true;
        }
        return result;
    }
    public static boolean palindromStr(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter number ? ");
    int n=sc.nextInt();
    System.out.println("Enter  string ? ");
    String s=sc.next();

    System.out.println("Ther number is : "+ palindrom(n));
    System.out.println("Ther string is : "+ palindromStr(s));
    }
}