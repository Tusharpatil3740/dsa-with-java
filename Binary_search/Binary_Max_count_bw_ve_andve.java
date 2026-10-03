public class Binary_Max_count_bw_ve_andve{
    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,-1,0,0,0,1,2,6,8,9,10};

        int low = 0,high = arr.length -1,count = 0;
        int n = arr.length;
        int first_positive = n;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] > 0){
                first_positive = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }
        low =0;
        high = arr.length -1;
        int lastnegative = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<0){
                lastnegative = mid;
                low = mid + 1;

            }
            else{
                high = mid -1;
            }

        }
        int positive = n-first_positive;
        int negative = lastnegative + 1;

        int maximum = Math.max(positive,negative);

        System.out.println("Positive Elements are:-"+positive);
        System.out.println("Negative integers are:-"+ negative);
        System.out.println("Mximum count are:-"+ maximum);



    }
}
