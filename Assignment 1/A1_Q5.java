import java.util.*;
public class A1_Q5 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the temp in F: ");
    double F=sc.nextDouble();
    double C=(F-32)*5/9;
    System.out.print("Temp in C: "+ C +" *C");
  }
}
