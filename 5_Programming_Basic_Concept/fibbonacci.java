import java.util.*;
public class fibbonacci 
{
    public static int fibb(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
    
        int nm1 = 0;
        int nth = 1;
        int np1 = 1;
    
        for (int i = 2; i <= n; i++) {
            np1 = nm1 + nth;
            nm1 = nth;
            nth = np1;
        }
        return np1;
    }
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size  of fibb");
int n=sc.nextInt();
   System.out.println(fibb(n));
}
}