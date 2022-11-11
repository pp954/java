//Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
import java.util.Scanner;
import java.util.Arrays;
public class ed{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(n>=2){
        System.out.println("Enter the elements for the array:");
        for (int i=0; i<=arr.length-1;i++)
        {
         arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        System.out.println(arr[0]==arr[n-1]);
        //System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
        }
        else
        {
            System.out.println("Enter the size of array equals to 2 or greater.");
        }
    }
}
