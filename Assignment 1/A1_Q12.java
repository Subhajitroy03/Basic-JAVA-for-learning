import java.util.*;
public class A1_Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle (P): ");
        int p=sc.nextInt();
        System.out.print("Enter the rate of interest per year (R): ");
        int r=sc.nextInt();
        System.out.print("Enter the time (T): ");
        int t=sc.nextInt();
        int si=p*t*r/100;
        System.out.println("Simple Interest : "+si);
    }
}