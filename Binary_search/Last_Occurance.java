import java.util.Scanner;

public class Last_Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int low = 0,high = n-1,result = -1;
        System.out.println("Enter the Target");
        int target = sc.nextInt();

        for(int i=0;i<n-1;i++){
            int mid = (low+high) / 2;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                result = mid;
                low = mid + 1;
            }


        }
        System.out.println("Last occurancr of given target is at" + result);

            
        }
}
    

