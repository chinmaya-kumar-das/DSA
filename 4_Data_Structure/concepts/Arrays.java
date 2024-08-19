import java.util.*;
public class Arrays 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

//1_ declairing the array way1
int arr[]=new int[5];
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    System.out.println(arr[0]);
    //way 2
int arr2[]={1,7,3,0,5,2,14,700,55};
String name[]={"chinmaya","ajay","suman","aju"};
//System.out.print(arr2[0]);

//2_ iterating  the array 
for(int i=0;i<arr2.length;i++){
    System.out.print(arr2[i]+" ");
}

//take input in the array 
int input[]=new int[10];
System.out.println("\n Enter the array");
for(int i=0;i<input.length;i++){
    input[i]=sc.nextInt();
}
System.out.println("\n Printer the input array--");
for(int i=0;i<input.length;i++){
    System.out.print(input[i]+" ");
}

//search the array 
System.out.println("\nEnter the key to find in the array ?");
int key=sc.nextInt();
for(int i=0;i<input.length;i++){
    if(input[i]==key){
        System.out.println("key found at index"+ i);
    }
    
}

//sort the array 
for(int i=0;i<input.length-1;i++){
    for(int j=0;j<input.length-1-i;j++){
        if(input[j]>input[j+1]){
              int temp=input[j];
              input[j]=input[j+1];
              input[j+1] =temp; 
        }
    }
}

System.out.println("final sorted array is");
for(int i=0;i<input.length;i++){
   System.out.print(input[i]+" ");
}

}
}