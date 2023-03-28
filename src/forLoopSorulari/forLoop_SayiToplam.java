package forLoopSorulari;

import java.util.Scanner;

public class forLoop_SayiToplam {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Baslangic sayisi: ");
        int baslangic = scan.nextInt();
        System.out.print("Bitis sayisi: ");
        int bitis = scan.nextInt();

        int toplam = 0;

        if (baslangic < bitis) {

            for (int i = baslangic; i <= bitis; i++) {

                toplam += i;

            }
            System.out.println("Toplam sayi: "+ toplam);

        }else {

            System.out.println("Gecersiz giris");
        }

    }
}