import java.util.Scanner;

public class Lsearchfunc {
    
    public static int LSearch(int key, int limit, int arr[]){
        
        for(int i=0; i<limit; i++){
            if(arr[i]==key){
                return(i);
            }
                
        }
        return(-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit,arr[],i;
        System.out.println("Enter the limit of array: ");
        
        limit = sc.nextInt();
        arr = new int[limit];
        System.out.println("Enter the values: ");
        for(i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to find: ");
        int key = sc.nextInt();

        int value = LSearch(key,limit,arr);
        if(value==-1){
            System.out.println("Value is not found");
        }else{
            System.out.println(key + " is found at index "+ value);
        }
        


    }
}
