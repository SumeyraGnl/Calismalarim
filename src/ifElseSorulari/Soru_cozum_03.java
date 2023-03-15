package ifElseSorulari;

import java.util.Scanner;

public class Soru_cozum_03 {
    public static void main(String[] args) {
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (not>=85){
            System.out.println("Notunuz AA");
        }else if (not>=65){
            System.out.println("Notunuz BB");
        }else if (not>=50){
            System.out.println("Notunuz CC");
        }else if (not<50){
            System.out.println("Notunuz DD");
        }
    }

}
