package ifElseSorulari;

import java.util.Scanner;

public class Soru_cozumu09 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


            for (int i = 1; i <=sayi ; i++) {
                if (sayi%7==0){
                    System.out.print( i + " ");

            }

        }

    }
}
