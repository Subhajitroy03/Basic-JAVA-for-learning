import java.util.*;
public class A1_Q21 {
    public static int count_digit(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int count_armstrong(int n){
        int sum=0;
        int l=count_digit(n);
        while(n!=0){
            sum=sum+(int)Math.pow(n%10,l);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int a_num=count_armstrong(num);
        if(a_num==num){
            System.out.println("Armstrong number...");
        }else{
            System.out.println("Not an Armstrong number..");
        }
        
        
    }
}