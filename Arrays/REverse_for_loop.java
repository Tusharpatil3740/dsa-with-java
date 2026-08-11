public class REverse_for_loop{
    public static void main(String[] args) {
        int[] arr = {56,345,78,4,45,5,45,6};
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        
        for(int cre : arr){
            System.out.print(cre+ " ");
        }
    }
    
}
