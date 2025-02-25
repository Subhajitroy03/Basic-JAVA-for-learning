import java.util.*;
public class A1_Q22 {
    public static int binarytodecimal(int n){
        int decimal=0;
        int i=0;
        while(n!=0){
            decimal=decimal+(n%10)*(int)Math.pow(2, i++);
            n=n/10;
        }
        return decimal;
    }
    public static int decimaltooctal(int n){
        int octal=0;
        int i=0;
        while(n>8){
            int a=n%8;
            octal=octal+a*(int)Math.pow(10, i++);
            n=n/8;
        }
        octal=octal+n*(int)Math.pow(10, i);
        return octal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int num=sc.nextInt();
        int decimal=binarytodecimal(num);
        int octal=decimaltooctal(decimal);
        System.out.println("Octal: = "+octal);
    }
}