import java.util.*;
public class A1_Q6 {
  public static void main(String[] args) {
    int a,b;
    if(args.length==2){
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
    }else{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt(); 
    }
    int sum=a+b;
    System.out.println("Sum= "+sum);
  }
}