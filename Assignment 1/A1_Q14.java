import java.util.*;
public class A1_Q14 {
    static int countDigit(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int reverseNumber(int num){
        int length=countDigit(num);
        int newnum=0;
        while(num!=0){
            newnum=newnum+(num%10)*(int)Math.pow(10,length-1);
            num=num/10;
            length--;
        }
        return newnum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Reversed number : "+ reverseNumber(num));
       
    }
}