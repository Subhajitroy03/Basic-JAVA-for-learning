public class A1_Q7 {
  public static void main(String[] args) {
    int a,b,result;
    if(args.length>=3){
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[2]);
        String operator=args[1];
        switch(operator){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "X":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            default:
                result=0;
                System.err.println("Invalid operator");

        }
        System.out.println("The result is "+result);


    }else{
        System.err.println("Invalid expression"); 
    }
  }
}
/*
HOW TO RUN
javac A1_Q7.java 
java A1_Q7 7 + 10
java A1_Q7 7 - 10
java A1_Q7 7 X 10  (PowerShell expands * to match filenames in the directory)
java A1_Q7 7 / 10
*/