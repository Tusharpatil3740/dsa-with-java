import java.util.Scanner;

public class Array_negative_eleonly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Enter array element");
        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Negative arrays Elements are:");
        for(int i=0;i<8;i++){
            if(arr[i]<0) System.out.println(arr[i]+" ");}
            
        }
            
    }
    

