package ifElseSorulari;

import java.util.Scanner;

public class Soru_ifElseif_ilgili {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Aldiginiz urun adedi: ");
        int adet= scan.nextInt();
        System.out.println("Urunun liste fiyati ");
        double fiyat= scan.nextDouble();
        System.out.println("Musteri kartiniz var mi?");
        String cevap= scan.next();
        if (cevap=="var" && adet>10){
            System.out.println("Ödemeniz gereken miktar: " );
        }
    }
}
