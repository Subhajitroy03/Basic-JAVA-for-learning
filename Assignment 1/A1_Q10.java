import java.util.*;
public class A1_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int mul=num<<1;
        System.out.println("Multiply by 2: " + mul);
        int div=num>>2;
        System.out.println("Divide by 4: " + div);
    }
}