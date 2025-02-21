import java.util.*;
public class A1_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }
        }else{
            if(year%4==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}