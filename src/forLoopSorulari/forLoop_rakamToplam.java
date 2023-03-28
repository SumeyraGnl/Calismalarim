package forLoopSorulari;

import java.util.Scanner;

public class forLoop_rakamToplam {
    public static void main(String[] args) {
         // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        
        int rakamToplami = 0;

        if (sayi>0){

            for (int i = sayi; i >=0 ; i++) {


                rakamToplami += sayi % 10;
                sayi /= 10;
            }

        }
        System.out.println(rakamToplami);




            
        }
        



    }



