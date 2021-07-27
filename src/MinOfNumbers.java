import java.util.Scanner;

public class MinOfNumbers {
    public static void main(String[] args) {
        short min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        short num1 = sc.nextShort();
        System.out.println("Enter the second number");
        short num2 = sc.nextShort();
        System.out.println("Enter the third number");
        short num3 = sc.nextShort();

        if(num1<num2 && num1<num3){
            min = num1;
        }else if(num2<num1 && num2<num3){
            min = num2;
        }else{
            min = num3;
        }
        System.out.println("The minimum number is: "+min);
    }
}
