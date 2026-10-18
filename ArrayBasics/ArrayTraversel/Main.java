package ArrayBasics.ArrayTraversel;

import java.util.Scanner;

public class Main {
    public static int sumofarray(int arr[]){

        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int max(int arr[]){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int avgofarray(int arr[]){

        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        int avg = sum / arr.length;

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
        */
       int arr[] = {1,2,2,5};
       System.out.println(sumofarray(arr));
       System.out.println(avgofarray(arr));
       System.out.println(max(arr));
       System.out.println(min(arr));

    }
}
