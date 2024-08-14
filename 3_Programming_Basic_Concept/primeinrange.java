
import java.util.Scanner;

public class primeinrange {
    public static boolean  prime(int n){
        boolean result=true;
        //int count=2;
        if(n==1){
            return false;
        }
        if( n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0)
            {
                return false;
            }
        }
        
        return result;
    }
    public static int primeRange(int a,int b){
        int count=0;
        for(int i=a;i<=b;i++){
            if(prime(i)==true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range value?");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(primeRange(a, b));
    }
}
