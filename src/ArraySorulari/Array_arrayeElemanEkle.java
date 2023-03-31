package ArraySorulari;

import java.util.Arrays;

public class Array_arrayeElemanEkle {
    public static void main(String[] args) {

        // Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int[] arr={3,5,7,9,2,6};

        System.out.println(Arrays.toString(ArrayaElemanEkleme(arr, 12)));

    }

    public static int[] ArrayaElemanEkleme(int[] arr, int eklenenEleman) {

        int[] yeniArr= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];

        }
        yeniArr[yeniArr.length-1]=eklenenEleman;

        return yeniArr;
    }
}
