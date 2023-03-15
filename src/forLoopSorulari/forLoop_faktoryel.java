package forLoopSorulari;

import java.util.Scanner;

public class forLoop_faktoryel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 20 den kucuk bir sayi girin : ");
        int sayi= scan.nextInt();

        int faktoriyel=1;

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;


        }
        System.out.print(sayi+"! =" + faktoriyel);





    }
}
