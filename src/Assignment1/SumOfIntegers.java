package Assignment1;
import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        integr();
    }

    public static void integr() {
        Scanner s = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.print("enter the integers with space' '");
        String str = s.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("the sum is :" + sum);


    }
}
