package ArraySorulari;

import java.util.Arrays;

public class soruCoz {
    public static void main(String[] args) {
        //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.


        ArraySayiArtirma();

        int arr1[]=ArraySayiArtirma();
        System.out.println(Arrays.toString(arr1));



    }

    public static int[] ArraySayiArtirma() {

        int[] arr= {2,10,24,9,4};

        for (int i = 0; i < arr.length; i++) {

            arr[i] +=2;


        }

        return arr;

    }


}
