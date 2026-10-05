public class Single_among_Double {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,50,50,65,65};
        int low = 0,high = arr.length-1;

        while(low<high){
            int mid = low + (high-low)/2;
            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                 low = mid + 2;
            }
            else{
                high = mid;
            }
        }
        System.out.println("Single Element is:" + arr[low]);
    }
}
    

