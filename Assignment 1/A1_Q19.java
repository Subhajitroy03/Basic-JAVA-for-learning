import java.util.*;
public class A1_Q19 {
    public static int isPrime(int n){
        int i,flag=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num=sc.nextInt();
        int i;
        for(i=2;i<=num;i++){
            if(isPrime(i)==1){
                System.out.print(i+ " ");
            }
        }
        
    }
}