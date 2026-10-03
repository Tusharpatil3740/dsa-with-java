public class Find_peak_mountain {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,7,8,3,2,1,0,-1};
        int low = 0,high = arr.length - 1;

        while(low<high){
            int mid = (low + high)/2;
            if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            
            else{
                high = mid;
            }

            
        }
        System.out.println(" Peak Element found at index:-" +low);

    }
    
}
