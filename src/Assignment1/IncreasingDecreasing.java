package Assignment1;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        increasing();
    }

    public static void increasing() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your first number");
        int first = s.nextInt();
        System.out.print("enter your second number");
        int second = s.nextInt();
        System.out.print("enter your third number");
        int third = s.nextInt();
        increasingDecreasing(first,second,third);

    }
    public static void increasingDecreasing(int first,int second,int third){
        if(first<second && second<third)
            System.out.println("increasing");
        else if(first>second && second>third)
            System.out.println("decreasing");
        else
            System.out.println("neither increasing nor decreasing");
    }
}
