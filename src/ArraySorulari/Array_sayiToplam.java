package ArraySorulari;

public class Array_sayiToplam {
    public static void main(String[] args) {

         // Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz

        int[] arr = {5,9,6,7,3};

        int sonuc = ArraydaToplam(arr);

        System.out.println(sonuc);

    }

    public static int ArraydaToplam(int[] arr) {

        int toplam= 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];


        }

        return toplam;
    }
}
