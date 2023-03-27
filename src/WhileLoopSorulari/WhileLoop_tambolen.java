package WhileLoopSorulari;

import java.util.Scanner;

public class WhileLoop_tambolen {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan aldıginiz pozitif bir tamsayinin
        //tam bolenlerini ve tam bolenlerinin toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int sayac=0;
        int toplam=0;


        int a=1;

        while (a<=sayi){

            if(sayi%a==0){
                toplam += a;
                sayac++;
            }
            a ++;


        }
        System.out.println(sayi + " sayisinin tam bolen sayisi: "+ sayac+ " toplami: "+ toplam);

         /*

        for (int i = 1; i <= sayi; i++) {
            if(sayi%i==0){
                toplam+=i;
                sayac++;
            }


        }
        System.out.println(sayi + " sayisinin tam bolen sayisi: "+ sayac+ " toplami: "+ toplam);

        */

    }


}
