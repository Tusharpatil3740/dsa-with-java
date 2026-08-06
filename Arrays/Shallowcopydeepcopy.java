
import java.util.Arrays;

public class Shallowcopydeepcopy {
    public static void main(String[] args) {
        
    
    int[] arr = {10,20,30,40};
    //int[] x = arr; // x is the shallow copy
    //x[0] = 100;

    int[] y = Arrays.copyOf(arr,arr.length);//deep copy
    y[0] =100;
    System.out.println(y[0]);
    }



    


    
}
