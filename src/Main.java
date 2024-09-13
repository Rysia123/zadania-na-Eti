import java.net.InterfaceAddress;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < lines ; i++) {
            String[] all = scanner.nextLine().split(" ");
            int[] x = new int[(all.length - 1) / 2];
            int xt = 0;
            int[] y = new int[(all.length - 1) / 2];
            int yt = 0;

                for (int j = 1; j < all.length; j++) {
                    int i1 = Integer.parseInt(all[j]);
                    if (j % 2 == 0) {
                            y[yt] = i1;
                            yt++;
                    }
                    else {
                            x[xt] = i1;
                            xt++;

                    }

            }
            System.out.println(polygonArea(x,y));
        }
        scanner.close();
    }

    public static double polygonArea(int[]x, int[] y){
        double fullArea = 0;
        for (int i = 1; i < x.length-1; i++) {
            double triangleArea = 0.5 * Math.abs((x[i] - x[0]) * (y[i+1] - y[0]) - (y[i] - y[0]) * (x[i+1] - x[0]));
            fullArea += triangleArea;
        }

        return fullArea;
    }



    }

