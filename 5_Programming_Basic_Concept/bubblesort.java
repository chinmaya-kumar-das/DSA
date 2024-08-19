import java.util.*;
public class bubblesort 
{
    public static int[] bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[6];
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
  }
  bubblesort(arr);
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
  }
}
}