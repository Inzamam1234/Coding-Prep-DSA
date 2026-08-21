package Iterative_Computation;

public class Main {

    public static int power(int base, int pow){

        int answer = 1;
        for(int i = 1; i <= pow; i++){
            answer = answer * base;
        }
        return answer;
    }

    public static int factorial(int x){
        int fact = 1;
        for(int i = 1; i <= x; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void fibonacci(int n){
        int a  = 0;
        int b = 1;

        for(int i = 0; i <= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void fibonacciNth(int n){
        int a  = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(factorial(5));
        fibonacci(5);
        System.out.println();
        fibonacciNth(6);
    }
}
