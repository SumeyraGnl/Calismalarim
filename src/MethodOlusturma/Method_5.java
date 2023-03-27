package MethodOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method_5 {
    public static void main(String[] args) {

        //Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> bolenler = pozitifTamBolenler(sayi);
        System.out.print(bolenler);



    }

    public static List<Integer> pozitifTamBolenler(int sayi) {

          List<Integer> bolenler=new ArrayList<>();

        int tamBolen=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){

               bolenler.add(i);
            }


        }
        return bolenler;
    }
}
