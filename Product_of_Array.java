import java.util.Scanner;

public class Product_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to consider array Element:-");
        int n = sc.nextInt();
        System.out.print("Enter the Array Element:-");
        int[] arr = new int[n];
        int pdt = 1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            pdt = pdt * arr[i];
            
        }
        System.out.println("Product of an Array Elements is:-");
        System.out.println(pdt);
    }
    
}