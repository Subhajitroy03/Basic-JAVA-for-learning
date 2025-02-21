import java.util.*;
public class A1_Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a=sc.nextInt();
        System.out.print("Enter the number b: ");
        int b=sc.nextInt();
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}