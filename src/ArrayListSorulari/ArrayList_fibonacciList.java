package ArrayListSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_fibonacciList {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=scan.nextInt();

        List<Integer>fibonacciSayisi= fibonacciListesi(sayi);

        System.out.println(fibonacciSayisi);


    }

    public static List<Integer> fibonacciListesi(int sayi) {

        List<Integer> list = new ArrayList<>();

        int a=0;
        int b=1;
        int c=a+b;

        list.add(a);
        list.add(b);

        while (c < sayi){

            list.add(c);

            a=b;
            b=c;
            c=a+b;

        }

        return list;
    }
}
