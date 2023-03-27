package WhileLoopSorulari;

import java.util.Scanner;

public class WhileLoop_kacSayiToplam {
    public static void main(String[] args) {

        /*
            Kullanicidan toplanmak uzere pozitif tamsayilar isteyin.
            Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
            Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
            bunlarin toplaminin kac oldugunu yazdirin
            Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
            negatif sayiyi sayi adedine ve toplama eklemeyin

         */

        Scanner scan = new Scanner(System.in);

        int sayi= 5;
        int sayac=0;
        int toplam =0;

        while (sayi!=0){
            System.out.println(" Lutfen pozitif tam sayi giriniz \nBitirmek istediginizde 0'a basiniz");
            sayi= scan.nextInt();

            if (sayi>0){
                sayac++;
                toplam+=sayi;



            }  else if (sayi <0){
                System.out.println("Lutfen pozitif bir tamsayi giriniz! Negatif sayi kullanamazsınız");
            }


        }
        System.out.println("Toplam "+sayac + " adet sayi girdiniz.Sayilarin toplami: "+toplam);


        /*

        int sayac= 0;
        int toplam = 0;
        int sayi = 0;



        while (true){
            System.out.println("Lutfen pozitif tam sayi giriniz \nBitirmek istediginizde 0'a basiniz");
            sayi = scan.nextInt();

            if(sayi==0){
                break;
            }else if(sayi<0){
                System.out.println("negatif sayi kullanamazsiniz ");

            }else if(sayi>0)
            sayac ++;
            toplam+= sayi;


        }

        System.out.println("Toplam "+sayac + " adet sayi girdiniz.Sayilarin toplami: "+toplam);


         */











    }

}
