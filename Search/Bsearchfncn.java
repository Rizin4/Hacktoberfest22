import java.util.Scanner;

public class Bsearchfncn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter the values in sorted order: ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to find");
        int key = sc.nextInt();

        int last = num-1;

        binarySearch(arr,0,last,key);

    }

    public static void binarySearch(int arr[], int first, int last, int key){

        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]==key){
                System.out.println(key+" is found at index "+mid);
                break;
            }
            else if(arr[mid]>key){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
        }

        if(first>last){
            System.out.println("Element is not found!!");
        }
    }

}


