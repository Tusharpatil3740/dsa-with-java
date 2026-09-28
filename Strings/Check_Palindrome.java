package Strings;

import java.util.Scanner;

public class Check_Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = sc.nextLine();

        int n = str.length();

        int i = 0, j = n - 1;

        boolean palindrome = true;

        while (i <= j) {

            if (str.charAt(i) != str.charAt(j)) {

                palindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}