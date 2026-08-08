public class Second_Smallest_Array { 
    public static void main(String[] args) {
        int[] arr = {34,56,68,27,58,95,55,58};
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min) min = arr[i];

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] < smin && arr[i] != min) smin = arr[i];
        }
        System.out.println("Smallest Elemenyt From an Array is:"+ min);
        System.out.println("Second Smallest Element from an Array:"+smin);

    }
    
}
    

