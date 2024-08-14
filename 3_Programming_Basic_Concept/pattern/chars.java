package pattern;
public class chars
{
public static void main(String[]args)
{

int n=5;
System.out.println("Pattern is for the input :");
int num=65;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)num++);
        }
        System.out.println();
    }
}
}