public class Cheack_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {23,45,79,98};
        
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i + 1]){
                sorted = false;
                System.out.println("Array is not sorted");
                break;
            }
        }
        if(sorted) System.out.println("Array is sorted");
        
            
    }
            
            
            
            

        
}
    

