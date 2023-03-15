package WhileLoopSorulari;

import java.util.Scanner;

public class WhileLoop_1 {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan=new Scanner(System.in);


        int sayac=0;
        int toplam=0;
        int sayi=0;

        while (toplam<=500){
            System.out.println("Lutfen toplanmak üzere sayilar giriniz");
             sayi= scan.nextInt();

            toplam += sayi;
            sayac ++;

        }
        System.out.println("Girilen sayi adedi: "+sayac+" Girilen sayi toplami: "+toplam);






    }
}
