package ArrayBasics.TraversalSwapping;

public class Main {

    public static int[] reverse(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return arr;
    }

    public static int[] swapfirstlastelement(int arr[]) {

        int temp = arr[0];

        arr[0] = arr[arr.length - 1];

        arr[arr.length - 1] = temp;

        return arr;
    }
    public static int[] moveallzeroestoend(int arr[]){

        int nz = 0;
        int res[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                res[nz] = arr[i];
                nz++;
            }
        }
        return res;
    }

    public static void moveNegatives(int[] arr) {

    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {

        // Left is already negative
        if (arr[left] < 0) {
            left++;
        }

        // Right is already positive
        else if (arr[right] >= 0) {
            right--;
        }

        // Left is positive and right is negative
        else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 0, -5, 6, 7, -8 };
        //int result[] = moveallzeroestoend(arr);
        moveNegatives(arr);
        //int result3[] = swapfirstlastelement(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
