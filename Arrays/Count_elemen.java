import java.util.Scanner;

public class Count_elemen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        
        int count = 0;
        System.out.println("Enter the Elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target value");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target) count++;

            else System.out.println("your target Element is not in Array"); break;

        }
        System.out.println("your Target Element"+ target+ " is "+ count + " times in Array");

    

    }

    
}
