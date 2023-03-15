package MethodOlusturma;

public class MethodOlusturma_6 {
    public static void main(String[] args) {

        // Verilen 1' den buyuk pozitif bir tamsayinin
        // asal sayi olup olamdigini yazdiran bir method olusturun

        asalSayiMi(3);

    }

    public static void asalSayiMi(int sayi){

        int sayac=0;

        for (int i = 2; i <sayi; i++) {

            if (sayi % i == 0) {
                sayac++;

            }

        }
            if(sayac==0){
                System.out.println("Girilen sayi asal sayidir");
            }else {
                System.out.println("Girilen sayi asal sayi degildir");
            }
        }




    }

