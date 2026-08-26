package ArrayBasics.TraversalCounting;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int linearsearch(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                target = i;
            }
        }
        return target;
    }

    public static int countOccurrence(int arr[], int target) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void oddevenCount(int arr[]) {

        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd Count : " + odd);
        System.out.println("Even Count : " + even);
    }

    public static void PositiveNegativeCount(int arr[]) {

        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println("Positive Count : " + pos);
        System.out.println("Negative Count : " + neg);
    }

    public static void FreqCount(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9, 11 };
        int arr2[] = { 2, 3, 3, 4, 4, 4, 5 };
        int arr3[] = { -1, -4, -9, 4, 6, 2 };
        System.out.println(linearsearch(arr, 7));
        System.out.println(countOccurrence(arr2, 4));
        oddevenCount(arr2);
        PositiveNegativeCount(arr3);
        FreqCount(arr2);
    }
}
