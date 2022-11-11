//Write a Java program to get the larger value between first and last element of an array (length 3) of integers 
import java.util.Scanner;
import java.util.Arrays;
public class ed{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
       System.out.println("Enter the elements for the first array:");
        for (int i=0; i<n;i++)
        {
         arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Greater element is:"+greater(arr1,n));
    }
    
    public static int greater(int[] arr,int a){
        if (arr[0]>arr[a-1])
        {
            return arr[0];
        }
        else
        {
            return arr[a-1];
        }
    }
}
