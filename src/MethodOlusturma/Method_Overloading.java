package MethodOlusturma;

public class Method_Overloading {
    public static void main(String[] args) {

        // Verilen 1'den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun

        System.out.println(isAsal(2));
        System.out.println(isAsal(45));


    }

    public static boolean isAsal(int sayi){

        int sayac=0;

        for (int i = 2; i < sayi; i++) {

            if (sayi%i == 0) {
                sayac++;
                break;
            }
            }
        if(sayi==2){
            return true;
        }else
        if(sayac==0){
               return true;
            }else {
                return false;
            }

        }
    }



