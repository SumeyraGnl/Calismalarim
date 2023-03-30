package ArraySorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Array_yeniArrayOlustur {
    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve
        // bize donduren bir method olusturun.

        int[] yeniArr= arrayOlustur();
        System.out.println("Yeni array: "+Arrays.toString(yeniArr));
    }

    public static int[] arrayOlustur() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu giriniz");
        int arrayUzunlugu=scan.nextInt();

        int[] arr=new int[arrayUzunlugu];

        for (int i = 0; i < arrayUzunlugu; i++) {

            System.out.println("Array'in "+(i+1)+". elemanini giriniz");

            arr[i] =scan.nextInt();


        }
        return arr;
    }
}
