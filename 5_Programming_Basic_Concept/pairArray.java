import java.util.*;
public class pairArray 
{
public static void main(String[]args)
{
    
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array ?");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array ?");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
int len=arr.length;
System.out.println("output pair array is");
    for (int i = 0; i <len ; i++) {
        int start=arr[i];
        for (int j = i+1;j < len; j++) {
            System.out.print("("+start+","+arr[j]+")");
        }
        System.out.println();
    }
System.out.println("output pair sub array is");
    for (int i = 0; i <len ; i++) {
        
        for (int j = i;j < len; j++) {
            
           for (int k = i; k <= j; k++) {
               System.out.print(+arr[k]);
           }
           System.out.println();
        }
    }
}
}