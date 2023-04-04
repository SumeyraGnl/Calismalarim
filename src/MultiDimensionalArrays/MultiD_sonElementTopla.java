package MultiDimensionalArrays;

import java.util.Arrays;

public class MultiD_sonElementTopla {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //toplaminini yazdiran bir method olusturun.

        int [][] arr = {{2,4,9,4},{6,9,7},{2,1,3,6}};

        sonElementlerToplami(arr);
    }

    public static void sonElementlerToplami(int[][] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

               toplam += arr[i][arr[i].length-1];



            }

        }
        System.out.println(toplam);
    }
}
