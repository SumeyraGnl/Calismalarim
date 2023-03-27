package MethodOlusturma;

import java.util.Scanner;

public class Method_4 {
    public static void main(String[] args) {

        //Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        int tamBolen=pozitifTamBolen(sayi);
        System.out.println(sayi+" Sayisinin pozitif tam bolen sayisi: "+tamBolen);

    }

    public static int pozitifTamBolen(int sayi) {

        int tamBolen=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                tamBolen ++;
            }

        }
        return tamBolen;
    }
}
