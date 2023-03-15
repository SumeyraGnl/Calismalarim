package BasitSorular;

import java.util.Scanner;

public class Soru_cozum_04 {
    public static void main(String[] args) {

        //Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char harf=scan.next().charAt(0);

        System.out.println("Girilen harften sonraki uc harf: " +(char)(harf+1) +"," +(char)(harf+2) +","
                                                               +(char)(harf+3));

    }
}
