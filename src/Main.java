import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int[] a = {1,2,4,6,8};
      int[] b = {4,5,7,8,9};


    }

    public static boolean[] convertInto(int[] a){
        boolean[] array = new boolean[100];
        for (int i = 0; i < a.length; i++) {
            array[a[i]] = true;
        }
        return array;
    }

    public static int[] convertBack(boolean[] a){
        List list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a)

        }
    }

    public static boolean[] add(boolean[] a, boolean[]b){
        boolean[] array = new boolean[b.length];
        for (int i = 0; i < b.length; i++) {
            array[i] = b[i];
            if (a[i] == true){
               array[i] = true;
            }

        }
        return array;
    }
}