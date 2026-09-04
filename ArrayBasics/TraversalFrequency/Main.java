package ArrayBasics.TraversalFrequency;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static int secondLargest(int arr[]){

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }

    public static int secondsmallest(int arr[]){

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                second = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < smallest && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }

    public static void findduplicate(int arr[]){

        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        for(int i = 0;i < arr.length; i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]);
                found = true;
            }
            else{
                set.add(arr[i]);
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }

    public static int missingNumber(int arr[]){

        int n = arr.length + 1;
        int expectsum = n * (n+1)/2;
        int actualsum = 0;
        for(int i = 0; i < arr.length; i++){
            actualsum += arr[i];
        }
        return expectsum - actualsum;
    }

    static int findXOR(int[] arr) {
        int xorResult = 0;

        for (int num : arr) {
            xorResult ^= num;
        }

        return xorResult;
    }
    public static void main(String[] args) {
        
        int arr[] = {23,4,5,67,89,2};
        int arr2[] = {1,3,4,5,6};
        int arr3[] = {2,3,4,3,2};
        System.out.println(secondLargest(arr));
        System.out.println(secondsmallest(arr));
        findduplicate(arr);
        System.out.println(missingNumber(arr2));
        System.out.println(findXOR(arr3));
    }
}
