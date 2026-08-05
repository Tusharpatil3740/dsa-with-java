import java.util.Scanner;

public class Sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to consider array Element:-");
        int n = sc.nextInt();
        System.out.print("Enter the Array Element:-");
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            
        }
        System.out.println("the sum of Array Elements is:-");
        System.out.println(sum);
    }
    
}
