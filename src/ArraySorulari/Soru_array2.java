package ArraySorulari;

public class Soru_array2 {
    public static void main(String[] args) {

        // - Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
         // method olusturun.

        int[][] sayilar={{3,4,7,5},{1,2,3},{1,5,9},{4,5}};

        int carpim=1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                carpim *= sayilar[i][j];


            }

        }
        System.out.println("Tum sayiların carpımı: " + carpim);


    }
}
