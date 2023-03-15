package ifElseSorulari;

import java.util.Scanner;

public class Soru_cozumu_06 {
    public static void main(String[] args) {


             //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz,ilk sayiyi girdikten sonra \"enter\" tusuna basarak ikinci sayiyi giriniz");

        double sayi1= scan.nextDouble();
            //double sayi2=scan.nextDouble();

            //System.out.println((int)sayi1/(int)sayi2);
        int sayi2= scan.nextInt();

        System.out.println((int)(sayi1/sayi2));


    }
}
