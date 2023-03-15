package ifElseSorulari;

import java.util.Scanner;

public class Soru_cozum_02 {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);
       //if ('A'<=krk && krk<='Z'){
       //    System.out.println("Girilen karakter büyük harftir");
       //} else{
       //    System.out.println("Girilen karakter buyuk harf degildir");
       //}



       //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin
        if ('a'<=krk && krk<='z'){
            System.out.println(Character.toUpperCase(krk));
        }else{
            System.out.println(krk);
        }




    }
}
