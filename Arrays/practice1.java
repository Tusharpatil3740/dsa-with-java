public class practice1 {
    public static void main(String[] args) {
        int[] arr = {12,45,7,89,45,23};
        int index = -1;
        int target = 45;
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target) {
                index = i ;
                System.out.println("First occurancwe at index:" +i);
                break;

            }  
                
        }
        for(int i=arr.length-1;i >= 0;i--){
            if(arr[i] == target){
                index = i;
                System.out.println("Last occurance at index: "+i);
                break;

            
            }

        }
            
        
       
    }
    
}
