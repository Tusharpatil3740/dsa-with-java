public class DeclareArray {
    public static void main(String[] args) {
        int[] arr = {93,59,04,53,33};
        //System.out.println(arr[3]);
        
        arr[4]=22;
        int[] x = arr;
        x[1] = 99;
        //System.out.println(arr[4 ]);
        System.out.println("Array length is: "+arr.length);

        /*for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }*/
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
        
    }
    
    
}
