package WhileLoopSorulari;

import java.util.Scanner;

public class WhileLoop_rakamToplam {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Rakamlari toplanacak bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi>0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi=sayi/10;

        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlari toplami: " + rakamlarToplami );





    }
}
