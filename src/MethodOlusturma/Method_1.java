package MethodOlusturma;

public class Method_1 {
    public static void main(String[] args) {

        //- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //mesaji verin
        //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        //yazdirin.

        String input = "Java Harika";

        indexYazdirma(input,5,8);

    }

    public static void indexYazdirma(String input, int baslangic, int bitis) {

        if(baslangic>bitis){
            System.out.println("yanlis giris yaptiniz.Baslangic bitisden buyuk olamaz");

        }else if(input.length()<bitis){

            System.out.println("hatali giris");

        }else{
            System.out.println(input.substring(baslangic, bitis));
        }



        }
}
