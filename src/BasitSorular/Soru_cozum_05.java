package BasitSorular;

import java.util.Scanner;

public class Soru_cozum_05 {
    public static void main(String[] args) {

          //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

         double sayi=scan.nextDouble();

         byte sonuc=(byte)sayi;

        System.out.println("sonuc:  " +sonuc);



    }
}
