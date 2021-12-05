package Assignment1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Prime();
    }

    public static void Prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number until which you want prime numbers of");
        int num = sc.nextInt();
        Number(num);
    }

    public static void Number(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
