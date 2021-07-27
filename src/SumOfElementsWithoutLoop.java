public class SumOfElementsWithoutLoop {
    public static int findSum(int array[], int N){
        int sum = 0;
        int index =0;
        while (true){
            sum = sum + array[index++];

            if (index<N){
                continue;
            }else {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int N =5;
        int sum=0;
        int array[] = {1,5,3,6,2};
        sum = findSum(array,N);
        System.out.println(sum);
    }
}
