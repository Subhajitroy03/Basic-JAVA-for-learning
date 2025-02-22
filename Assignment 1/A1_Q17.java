import java.util.*;
public class A1_Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if(n>0){
            int sum=((n+1)*n)/2;
            System.out.println("Sum of "+n+ " natural numbers is: "+sum);
        }
        
    }
}