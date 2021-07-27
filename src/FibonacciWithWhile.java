public class FibonacciWithWhile {
    public static void main(String[] args) {
        int num1=0;
        int num2 =1;
        int N =5;
        int i=1;
        while(i<=N){
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 +num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
