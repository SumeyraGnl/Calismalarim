package forLoopSorulari;

import java.util.Scanner;

public class forLoop_faktoryel {
    public static void main(String[] args) {

        // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 20 den kucuk bir sayi girin : ");
        int sayi= scan.nextInt();

        int faktoriyel=1;

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;


        }
        System.out.print(sayi+"! =" + faktoriyel);


        //- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720





    }
}
