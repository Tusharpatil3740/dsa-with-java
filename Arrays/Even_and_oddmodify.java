public class Even_and_oddmodify {
    public static void main(String[] args) {
       
        int[] arr = {10,20,30,40,50,60};

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0 )
                arr[i] = arr[i] + 10;
            
            else
                arr[i] = arr[i] * 2;
        }
        System.out.println("Modified Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    
}
