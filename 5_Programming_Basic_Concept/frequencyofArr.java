import java.util.*;
public class frequencyofArr 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array");

int arr[] = new int[5];
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}

int frequency[]=new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    frequency[arr[i]]++;
}

System.out.println("Frequency of array is");
for (int i = 0; i < arr.length; i++) {
    if (frequency[i] > 0) {
        System.out.println(i + "         " + frequency[i]);
    }
}}
}