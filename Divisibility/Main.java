package Divisibility;

public class Main {
    
    public static int countDivisors(int n){

        int count = 0;
        for(int i = 1; i * (long)i <= n; i++){
            if (n % i == 0) {
                if (i == n / i) {
                    count += 1; //Adds 1 when i is the perfect-square root divisor (paired with itself)
                } else {
                    count += 2; //otherwise adds 2 for the distinct pair.
                }
            }
        }
        return count;
    }

    public static int sumofDivisors(int n){

        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int gcd(int a,int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){

        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        System.out.println(countDivisors(36));
        System.out.println(sumofDivisors(12));
        System.out.println(gcd(48, 18));
        System.out.println(lcm(12, 18));
    }
}
