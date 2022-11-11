//Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).
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
        if (arr[0]>arr[a-1] && arr[0]>arr[a/2])
        {
            return arr[0];
        }
        else if (arr[a/2]>arr[a-1] && arr[0]<arr[a/2])
        {
            return arr[a/2];
        }
        else
        return arr[a-1];
    }
}

/*
int[] array_nums = {20, 30, 40, 50, 67};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	if(max_val <= array_nums[array_nums.length-1])
		max_val = array_nums[array_nums.length-1];
	if(max_val <= array_nums[array_nums.length/2])
		max_val = array_nums[array_nums.length/2];
	System.out.println("Largest element between first, last, and middle values: "+max_val);  
  */
