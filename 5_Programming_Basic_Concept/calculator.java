import java.util.*;
public class calculator 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first no ?");
    float a=sc.nextFloat();
    System.out.println("Enter the operator ?");
    String opr=sc.next();
    System.out.println("Enter the 2nd number ?");
    float b=sc.nextFloat();
    switch (opr) {
        case "+":{
            System.out.println(" Sum of 2 number is= "+(a+b));
        }
        break;
        case "-":{
            System.out.println(" substraction of 2 number is= "+(a-b));
        }break;
        case "*":{
            System.out.println(" mul of 2 number is= "+(a*b));
        }break;
        case "/":{
            System.out.println(" div of 2 number is= "+(a/b));
        }break;
        case "%":{
            System.out.println(" mod of 2 number is= "+(a%b));
        }
        
        break;
        default:
        System.out.println("Enter valid operator");
           
    }
}
}