package Digit_Extraction;

public class Main {

    public static int countDigit(int x){
        int count = 0;
        while(x>0){
            int digit = x % 10;
            count++;
            x = x / 10;
        }
        return count;
    }

    public static int sumofdigits(int x){
        int sum = 0;
        while(x>0){
            int digit = x % 10;
            sum = sum + digit;
            x = x / 10;
        }
        return sum;
    }

    public static int profofdigits(int x){
        int prod = 1;
        while(x>0){
            int digit = x % 10;
            prod = prod * digit;
            x = x / 10;
        }
        return prod;
    }

    public static int reverse(int x){
        int rev = 0;
        while(x>0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x/10;
        }
        return rev;
    }

    public static boolean palindrome(int x){
        int original = x;
        int rev = 0;
        while(x>0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x/10;
        }
        if(rev == original){
            return true;
        }
        return false;
    }

    public static int largest(int x){
        int largest = 0;
        while(x>0){
            int digit = x % 10;
            if(digit > largest){
                largest = digit;
            }
            x = x / 10;
        }
        return largest;
    }

    public static int smallest(int x){
        int smallest = Integer.MAX_VALUE;
        while(x>0){
            int digit = x % 10;
            if(digit < smallest){
                smallest = digit;
            }
            x = x / 10;
        }
        return smallest;
    }
    public static void main(String[] args) {
        
        System.out.println(countDigit(678923));
        System.out.println(sumofdigits(12345));
        System.out.println(profofdigits(12345));
        System.out.println(reverse(12345));
        System.out.println(palindrome(12321));
        System.out.println(largest(1259));
        System.out.println(smallest(1234));
    }
}
