package ForEachLoopSorulari;

import java.util.Scanner;

public class ForEach_HarfCumledeKullanilmismi {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf = scan.next();

        String[] arr = cumle.split("");

        int sayac = 0;
        for (String each : arr
        ) {
            if (each.equalsIgnoreCase(harf)) {
                sayac++;

            }

        }
        if(sayac==0){
            System.out.println(harf + " harfi cumlede kullanilmamistir.");

        }else {
            System.out.println("Istenen harf cumlede " + sayac + " kez kullanılmıstır.");

        }
    }
}
