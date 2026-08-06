public class Count_even_and_odd {
    public static void main(String[] args) {
        int even = 0,odd = 0;
        int[] arr = {23,34,56,33,54,45,67};
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("The even number is:"+even);
        System.out.println("The odd number is:"+odd);
    }
    
}
