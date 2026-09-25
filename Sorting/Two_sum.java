import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int n = sc.nextInt();
        System.out.println("Enter the target");
        int target = sc.nextInt();
        boolean found = false;
        int[] arr = new int[n];
        System.out.println("Enter the Element:-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("pair found:-" + arr[i] + " + " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
       
            System.out.print("Pair not found");
        }
    }
    
}
