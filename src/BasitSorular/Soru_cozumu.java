package BasitSorular;

import java.util.Scanner;

public class Soru_cozumu {
    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip
        //bunlarin toplamini ve carpımını yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi girin: ");
        double sayi1= scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi2=scan.nextInt();

        System.out.println("sayilarin toplami: "+ (sayi1+sayi2) +"\nsayilarin carpımı: " + (sayi1*sayi2) );

        }




    }

