import java.util.*;

public class sum {
    //optimized
    public static int sums(int num){
        
        if(num<=1){
            return 1;
        }
        return num+sums(num-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int n=sc.nextInt();
     //brute force
     int sum=0;
        for(int i=1;i<=n;i++){
           sum+=i;
        }
    System.out.println("brute force sum "+sum);
    
        System.out.println("optimized sum "+sums(n));
    

    }
}