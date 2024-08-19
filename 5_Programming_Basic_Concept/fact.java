import java.util.*;
public class fact 
{
    public static int facts(int n){
        int facto=1;
        if(n>0){

            facto= n* facts(n-1);
        }
        return facto;
    }
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("fact by recurrsion is "+facts(n));

int fact=1;
while(n>0){
 fact*=n;
 n--;
}
System.out.println("fact is "+fact);
}
}