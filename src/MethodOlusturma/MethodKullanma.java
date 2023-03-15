package MethodOlusturma;

import java.util.Scanner;

public class MethodKullanma {
    public static void main(String[] args) {

        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk iki pozitif tamsayi aliniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int a=MethodOlusturma_4.faktoryelHesapla(sayi1);
        int b=MethodOlusturma_4.faktoryelHesapla(sayi2);

        System.out.println(a+b);


    }


}
