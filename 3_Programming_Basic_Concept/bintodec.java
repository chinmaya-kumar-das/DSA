import java.util.*;
public class bintodec 
{
    public static int binarytodecimal(int bin) {
        int dec = 0;    // This will hold the final decimal number
        int base = 1;   // Base value for binary (1, 2, 4, 8, ...)
    
        while (bin > 0) {
            int lastDigit = bin % 10;   // Extract the last digit of the binary number
            dec += lastDigit * base;    // Add the last digit multiplied by the current base to the decimal number
            bin /= 10;                  // Remove the last digit from the binary number
            base *= 2;                  // Move to the next base value (2, 4, 8, ...)
        }
    
        return dec;
    }
    
    public static int decimaltobinary(int dec){
        int bin = 0;        // This will hold the final binary number
        int place = 1;      // This represents the current place value in binary (1, 10, 100, etc.)
    
        while (dec > 0) {
            int remainder = dec % 2;  // Get the remainder when dec is divided by 2 (0 or 1)
            bin += remainder * place; // Add the remainder to the correct place in bin
            dec /= 2;                 // Divide dec by 2 to get the next digit
            place *= 10;              // Move to the next place value (10, 100, etc.)
        }
    
        return bin;
    }
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter decimal and binary");
int dec=sc.nextInt();
int bin=sc.nextInt();

        System.out.println(decimaltobinary(dec));
        System.out.println(binarytodecimal(bin));
}
}