import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double answer=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);

        boolean isValid = true;

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                try {
                    answer = num1/num2;
                }catch (ArithmeticException ex){
                    isValid = false;
                    System.out.println("You can not divide to zero");
                }
                break;
                
            default:
                isValid = false;
                System.out.println("Enter the correct operator");
                break;
        }
        if(isValid) System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}
