// Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays
import java.util.Scanner;
import java.util.Arrays;
public class ed{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the size for the second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
       
        System.out.println("Enter the elements for the first array:");
        for (int i=0; i<=arr1.length-1;i++)
        {
         arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements for the second array:");
        for (int i=0; i<=arr2.length-1;i++)
        {
         arr2[i] = sc.nextInt();
        }
         int[] arr3 = {arr1[0],arr2[n2-1]};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
       
        
    }
}
