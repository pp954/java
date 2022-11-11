import java.util.Scanner;
import java.util.Arrays;
public class ed{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements for the array:");
        for (int i=0; i<=arr.length-1;i++)
        {
         arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
