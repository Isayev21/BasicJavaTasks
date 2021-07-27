import java.util.Scanner;

public class MaxOfNumbers {
    public static void main(String[] args) {
        float max;
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.printf("enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.printf("enter the third number: ");
        float num3 = sc.nextFloat();

        if (num1>num2 && num1>num3){
            max = num1;
        }else if(num2>num1 && num2 >num3){
            max = num2;
        }else{
            max = num3;
        }
        System.out.println("Biggest number among the inputs are: "+max);
    }
}
