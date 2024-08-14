package pattern;

import java.util.Scanner;

public class invertedstars {
    public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of pattern ?");
    int n=sc.nextInt();
    System.out.println("Pattern is for the input :"+n);
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
}
