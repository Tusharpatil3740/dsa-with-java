import java.util.Scanner;

public class Max_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to consider array Element:-");
        int n = sc.nextInt();
        System.out.print("Enter the Array Element:-");
        int[] arr = new int[n];
        int max = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] > max)
                max = arr[i];
            
        }
        
        System.out.println("Maximum Element From an Array is:-");
        System.out.println(max);
    }
}