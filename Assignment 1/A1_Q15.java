import java.util.*;
public class A1_Q15 {
    public static int Fibo(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num>0){
            int i;
            System.out.println("The "+num+" terms of Fibonacci Series: ");
            for(i=0;i<num;i++){
                
                System.out.print(Fibo(i)+" ");
            }
        }
    }
}