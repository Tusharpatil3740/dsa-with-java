public class Print_even_ofArray {
    public static void main(String[] args) {
        int[] arr = {10,45,56,67,34,76,89};
        for(int i=0;i<arr.length;i++){
            if(i%2==0) System.out.println(arr[i]);
        }
    }
    
}
