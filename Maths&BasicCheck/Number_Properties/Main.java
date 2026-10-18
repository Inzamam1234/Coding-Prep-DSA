package Number_Properties;

public class Main {
    public static String IsPrime(int n){
        if(n < 2){
            return "Not Prime";
        }
        boolean isPrime = true;
        for(int i = 2; i * (long)i <= n; i++){ //Casting to long avoids integer overflow when n is close to its maximum constraint
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            return "Prime";
        }
        else{
            return "Not Prime";
        }
    }
    public static String ArmstrongNum(int x){

        int count = 0;
        int original = x;
        while (x != 0) {
            count = count + 1;
            x = x/ 10;
        }
        x = original;
        int sum = 0;
        while(x>0){
            int digit = x % 10;
            sum = sum + (int) Math.pow(digit,count) ;
            x = x / 10;
        }
        if(sum == original){
            return "ArmStrong Number";
        }
        else{
            return "Not An ArmStrong Number";
        }
    }

    public static String StrongNum(int x){

        int original = x;
        int sum = 0;
        while(x>0){
            int digit = x % 10;
            int fact = 1;
            for(int i = 1; i <=digit; i++){ // 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145 (Strong Number)
                fact = fact * i;
            }
            sum = sum +fact;
            x = x / 10;
        }
        if(sum == original){
            return "Strong Number";
        }
        else{
            return "Not An Strong Number";
        }
    }

    public static String PerfectNum(int x){

        int original = x; 
        int sum = 0;
        for(int i = 1; i <= x/2; i++){
            if(x % i == 0){
                sum = sum + i;
            }
        }
        if(sum == original){
            return "Perfect Number";
        }
        else{
            return"Not A Perfect Number";
        }
    }
    public static void main(String[] args) {
        System.out.println(IsPrime(9));
        System.out.println(ArmstrongNum(153));
        System.out.println(StrongNum(145));
        System.out.println(PerfectNum(6));
    }
}
