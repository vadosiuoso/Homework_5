public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciIteration(33));

    }

    /*Space complexity O(1)
      Time complexity 0(2^n) => O(n)
     */
    public static int fibonacciRecursive(int n){
        if(n == 0 || n == 1) {
            return n;
        }else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    /*Space complexity O(3) => O(1)
      Time complexity O(n)
     */
    public static int fibonacciIteration(int n){
        int preprevious = 0;
        int previous = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = preprevious + previous;
            preprevious = previous;
            previous = current;
        }
        return current;
    }

    /*Space complexity O(n)
      Time complexity O(n)
     */
    public static int fibonacciDP(int n){
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}