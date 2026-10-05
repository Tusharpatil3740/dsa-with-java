public class Floor_in_sorted{
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};
        int ans = -1;
        int low = 0,high = arr.length-1;
        int x = 11;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]<=x){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }
        System.out.println("Floor is found at index"+ ans);




    }

}