package WhileLoopSorulari;

import java.util.Scanner;

public class WhileLoop_ussunuHesapla {
    public static void main(String[] args) {
        // Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.
        

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tam sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.print("Hesaplamak istediginiz üs sayisini giriniz: ");
        int usSayi = scan.nextInt();

        int sonuc= ussunuHesaplama(sayi,usSayi);
        System.out.println(sonuc);



    }

    public static int ussunuHesaplama(int sayi, int ussayi) {
        int carpim=1;


        while (ussayi!=0){

            carpim *=sayi;
            ussayi --;
        }
        return carpim;

    }

}
