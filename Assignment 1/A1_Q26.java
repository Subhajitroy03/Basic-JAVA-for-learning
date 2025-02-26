import java.util.*;
public class A1_Q26 {
    public static int is_single_digit(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        if(count>1){
            return 0;
        }else{
            return 1;
        }
    }
    public static int mul_digit(int n){
        int mul=1;
        while(n!=0){
            mul=mul*(n%10);
            n=n/10;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        while(is_single_digit(num)==0){
            
            num=mul_digit(num);
            System.out.println("Intermediate result: "+ num);
        }
        System.out.println("Final Answer: "+num);
        
        
        
    }
}