//Write a Java program to test if the first or the last element of two array of integers are same. The length of the array must be greater than or equal to 2.
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
        if(n1>=2 && n2>=2){
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
        System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));
        System.out.println(arr1[0]==arr2[0] || arr1[n1-1]==arr2[n2-1]);
        //System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
        }
        else
        {
            System.out.println("Enter the size of array equals to 2 or greater.");
        }
    }
}
