package Assignment1;

import java.util.*;

class Sorting {
        void SortStrings() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number of strings n:");
        int n = s.nextInt();
        String[] str = new String[n];
        System.out.print("enter the strings");
        for(int i =0;i<n;i++){
            str[i] = new String(s.next());
        }
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                }
            }
        }
        System.out.println("sorted string");
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}
class driver
{
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.SortStrings();
    }
}