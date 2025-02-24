import java.util.*;
public class A1_Q20 {
    public static int sum_of_factors(int n){
        int i,sum=0;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int pnum=sum_of_factors(num);
        if(pnum==num){
            System.out.println("Perfect number...");
        }else{
            System.out.println("Not a perfect number..");
        }
        
        
    }
}