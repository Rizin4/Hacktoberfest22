import java.util.Scanner;
public class bubblessort{
    public static void bubbleSort(int[] a,int num){
        int i,j,temp,flag=0;
        for(i=0;i<num;i++)
        {
            flag=0;
            for(j=0;j<num-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    flag=1;
                   temp=a[j];
                   a[j]=a[j+1];
                     a[j+1]=temp;   
                }  
            }
            if(flag==0)
                {
                    System.out.println("array is sorted");
                     break;
                }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the number of elements:");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements:");
        for( i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sort:");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr,num);
        System.out.println("Array after sort:");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}