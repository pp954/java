//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
import java.util.Scanner;
import java.util.Arrays;
public class ed{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[2];
       System.out.println("Enter the elements for the first array:");
        for (int i=0; i<2;i++)
        {
         arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        if(arr1[0]==4 || arr1[0]==7){
            System.out.println("True");
        }
        else
        {
        System.out.println(arr1[1]==4 || arr1[1]==7);
        }
    }
}
