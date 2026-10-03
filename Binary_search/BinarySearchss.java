import java.util.Scanner;

public class BinarySearchss{
    public static void main(String[] args) {
        int[] arr = {4,5,6,78,88,93,99};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Target");
        int target = sc.nextInt();

        
        int low = 0,high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println("Target is found:-" + arr[mid]);
                return;
            }

            else if(arr[mid] < target){ 
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        System.out.println("Element not found");
    }
}