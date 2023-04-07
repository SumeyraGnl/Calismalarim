package ArrayListSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_tamBolebilen {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi= scan.nextInt();

        List<Integer> bolenler = tamBolebilenSayilar(sayi);
        System.out.println(bolenler);


    }

    private static List<Integer> tamBolebilenSayilar(int sayi) {

        List<Integer> tamBolen=new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi%i==0){

                tamBolen.add(i);
            }

        }
        return tamBolen;
    }
}
