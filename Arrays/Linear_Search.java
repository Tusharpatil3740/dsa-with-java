public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int index = -1;
        int target = 40;

        for(int i=0;i<arr.length;i++){

            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1)
        System.out.println("Element is found at Index:" +index );
        else System.out.println("Element is not found");
    
              
    }
    
}
