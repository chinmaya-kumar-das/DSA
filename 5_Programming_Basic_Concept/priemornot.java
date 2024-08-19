import java.util.*;
public class  priemornot
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int n=sc.nextInt();
 int factor=2;

 //find the factors
 if(n==1 || n==2){
   factor=2;

 }else{
    for(int i=2;i<n;i++){
        if(n%i==0){
            factor++;
        }
    }
 }
 if(factor==2){
    System.out.println("Prime");
 }else{
    System.out.println("Not Prime");
 }
}
}