import java.util.*;
public class  amstrong
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter number ? ");
    int n=sc.nextInt();

    int org=n;
    int amstrong=0;
    while(n>0){
        int r=n%10;
        amstrong+=(r*r*r);
        n=n/10;
    }
    if(amstrong==org){
        System.out.println("Amstrong");
    }else{
        System.out.println("Not amstrong");
    }
}
}