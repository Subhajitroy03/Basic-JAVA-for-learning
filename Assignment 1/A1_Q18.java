import java.util.*;
public class A1_Q18 {
    public static int count_digit(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    
    public static int reverse_number(int num){
        int rnum=0;
        int l=count_digit(num);
        while(num!=0){
            int ld=num%10;
            num=num/10;
            rnum=rnum+ld*(int)Math.pow(10,l-1);
            l--;
        }
        return rnum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int reverse=reverse_number(n);
        if(reverse==n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

       
    }
}