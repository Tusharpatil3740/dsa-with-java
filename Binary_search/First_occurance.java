import java.util.Scanner;

class First_occurance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();

        int low = 0, high = n - 1;
        int result = -1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] < target) {
                low = mid + 1;
            }
            else if(arr[mid] > target) {
                high = mid - 1;
            }
            else {
                result = mid;
                high = mid - 1;
            }
        }

        System.out.println("First Occurrence = " + result);
    }
}
