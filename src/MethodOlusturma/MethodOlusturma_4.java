package MethodOlusturma;

public class MethodOlusturma_4 {
    public static void main(String[] args) {

        // verdigimiz bir sayinin faktöryelini hesaplayip
        //  sonucu bize döndüren bir method olusturun

        int faktoryel=faktoryelHesapla(5);
        System.out.println(faktoryel);


    }
    public static int faktoryelHesapla(int sayi){

        int faktoryel= 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
        }

        return faktoryel;
    }


}
