package Strings;

public class Count_Vovels_lowercase {
    String str = "aebfgioudhyafuegoignii";
    int count = 0;
    for(int i=0;i<str.length;i++){
        char ch = str.charAt(i);
        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            count++; 
    }
    System.out.println(count);
    

}
