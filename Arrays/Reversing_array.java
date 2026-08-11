public class Reversing_array {
    public static void main(String[] args) {
        int[] arr = {56,345,78,4,2,45,5,45,6};
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int cre : arr){
            System.out.print(cre+ " ");
        }
    }
    
}
