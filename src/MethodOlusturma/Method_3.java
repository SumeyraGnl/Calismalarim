package MethodOlusturma;

import java.util.Scanner;

public class Method_3 {
    public static void main(String[] args) {
        //- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        String sonuc= asalMi(sayi);
        System.out.println(sonuc);
    }

    public static String asalMi(int sayi) {


        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;

            }
        }
        if(flag==0){

           return "Asal sayi";
        }else {
           return "Asal sayi degildir";
        }


    }
}
