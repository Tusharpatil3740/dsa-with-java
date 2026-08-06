import java.util.Scanner;

public class Minimum_in_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to consider the number of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the element");
        

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if (arr[i] < min)
                min = arr[i];

        } 
        System.out.println("minimum element is");  
        System.out.println(min);  
            
        
    }
}