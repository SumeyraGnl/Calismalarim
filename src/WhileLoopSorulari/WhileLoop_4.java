package WhileLoopSorulari;

import java.util.Scanner;

public class WhileLoop_4 {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int toplam=0;

        while (sayi>0){
            toplam +=sayi%10;
            sayi/=10;
        }

        System.out.println("Sayinin rakamlar toplami: "+toplam);



    }
}
