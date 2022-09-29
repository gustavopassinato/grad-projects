public class App {
    public static void main(String[] args) throws Exception {
        long[] fib = new long[50];
        fib[0] =1;
        fib[1] =1;

        System.out.print("Fibonacci: "+ fib[0]+", "+ fib[1]+", ");
        for (int i = 2; i < 50 ; i++){
            fib[i]=fib[i-1]+fib[i-2];
            System.out.print(fib[i]+", ");
        }
    }
}
