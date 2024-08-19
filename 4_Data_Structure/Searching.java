import java.util.*;
public class Searching
{
    public static int linesrSearch(int arr[],int elem) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elem){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int elem) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==elem){
                return mid;
            }
            else if (elem>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
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
    System.out.println("enter the element to search ?");
    int elem=sc.nextInt();

    System.out.println("Key find at index "+linesrSearch(arr, elem));
    System.out.println("Key find at index "+binarySearch(arr,elem));
    sc.close();
}
}