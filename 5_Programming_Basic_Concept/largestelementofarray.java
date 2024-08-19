import java.util.*;
public class largestelementofarray 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array");
int arr[] = new int[5];
System.out.println("Enter 5 integers:");
for (int i = 0; i < arr.length; i++) {
  arr[i]=sc.nextInt();
}

int largest=Integer.MIN_VALUE;
int smallest=Integer.MAX_VALUE;

for (int i = 0; i < arr.length; i++) {
   if( arr[i]>=largest){
    largest=arr[i];
   }
   if(arr[i]<=smallest){
    smallest=arr[i];
   }
  }
  System.out.println("smallest Element is "+smallest+" biggest is "+largest);
}
}