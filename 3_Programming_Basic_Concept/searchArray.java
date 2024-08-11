import java.util.*;
public class  searchArray
{
    public static int linearSearch(int arr[],int elem){
        int result=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elem){
                result=i;
            }
        }
        return result;
    }
    public static int binarySearch(int arr[],int elem){
        int result=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid] ==elem){
                return mid;
            } if(mid>=elem){
                end--;
            }else{
                start++;
            }
        }
        return result;
    }
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array");
    int array[]=new int[5];
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("Enter Element");
    int elem=sc.nextInt();

    //System.out.println("Element found at Index : "+linearSearch(array, elem));
    System.out.println("Element found at Index : "+binarySearch(array, elem));

}
}