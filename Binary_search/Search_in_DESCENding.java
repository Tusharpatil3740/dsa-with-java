
public class Search_in_DESCENding {
    public static void main(String[] args) {
        
    
    
    int[] arr = {55,34,23,11,9,3};
    int n = arr.length;
    int target = 55;
    
    int low = 0,high = n-1;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]<target){
                high = mid - 1;
            }
            else if(arr[mid]>target){
                low = mid + 1;
            }
            else{
                System.out.println("Target is found at index " + mid);
                return;

            }
        }
        System.out.println("Target is not found");
    }
        
        
}

    

