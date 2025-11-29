import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter operand 1 : ");
        double num1=sc.nextDouble();

        System.out.println();
        System.out.print("Enter operand 2 : ");
        double num2=sc.nextDouble();

        System.out.println();

        System.out.print("Enter the Operator (+ - * / %) : ");
        sc.nextLine();
        String operator=sc.nextLine();

        System.out.println();
        System.out.println("Calculation Result");
        switch (operator) {
            case "+":
                System.out.println("Addition :"+(num1+num2));
                break;

            case "-":
                System.out.println("Subtraction :"+(num1-num2));
                break;

            case "*":
                System.out.println("Multiplication :"+(num1*num2));
                break;

            case "/":
                System.out.println("Division :"+(num1/num2));
                break;
            
            case "%":
                System.out.println("Modulus :"+(num1%num2));
                break;

            default:
                break;
        }
    }
}
