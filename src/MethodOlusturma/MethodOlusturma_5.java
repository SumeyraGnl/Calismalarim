package MethodOlusturma;

public class MethodOlusturma_5 {
    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        String metin="Kader gayrete asiktir";

        System.out.println(stringiTersineCevirme(metin));


    }

    public static String stringiTersineCevirme(String metin){
         String tersMetin="";

        for (int i = metin.length()-1; i >=0; i--) {

            tersMetin += metin.charAt(i);
        }


       return tersMetin;
    }


}
