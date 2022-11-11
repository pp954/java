//Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. 
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
       int x= arr1[0];
       arr1[0]=arr1[n-1];
       arr1[n-1]=x;
       System.out.println(Arrays.toString(arr1));  
    }
}
