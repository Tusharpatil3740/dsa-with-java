public class selectionsort_descending {

    
    public static void main(String[] args) {
        int[] arr = {7,4,9,2,1};

        for(int i=0;i<arr.length-1;i++){
            int maxindex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[maxindex]){
                    maxindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
