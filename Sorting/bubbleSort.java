import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0) {
                break;
            }
        }

        if (flag == 0)

        {
            System.out.println("\nArray is already Sorted.");
        } else {
            System.out.print("\nArray after sorting: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
