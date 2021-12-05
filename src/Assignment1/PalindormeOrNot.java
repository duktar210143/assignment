package Assignment1;

import java.util.Scanner;

public class PalindormeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("enter a string");
        str = sc.nextLine();
        check(str);
    }

    public static void check(String str) {
        String reverse = "";
        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);

        if (str.equals(reverse))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");


    }
    }
//package Assignment1;
//
//import java.util.Scanner;
//
//public class PalindormeOrNot {
//        public static void main (String args[])
//        {
//            String str, rev = "";
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter a string:");
//            str = sc.nextLine();
//
//            int length = str.length();
//
//            for (int i = length - 1; i >= 0; i--)
//                rev = rev + str.charAt(i);
//
//            if (str.equals(rev))
//                System.out.println(str + " is a palindrome");
//            else
//                System.out.println(str + " is not a palindrome");
//
//        }
//    }
