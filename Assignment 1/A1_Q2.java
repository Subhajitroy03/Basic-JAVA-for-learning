

public class A1_Q2 {
  public static void main(String[] args) {
    if(args.length>0){
        System.err.println(args[0]);
        /*
TO RUN
1) javac A1_Q2.java
2) java A1_Q2 "Academy of Technology"
*/
    }else{
        System.out.println("No argument provided");
    }
  }
}
