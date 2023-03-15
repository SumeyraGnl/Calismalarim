package MethodOlusturma;

public class Method_StringTers {
    public static void main(String[] args) {

        // Soru 3- For loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        // donduren bir method olusturun.

        String metin="her sey güzel olacak";


        System.out.println(stringiTersineCevirme(metin));


    }

    public static String stringiTersineCevirme(String metin){

        String tersmetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersmetin += metin.charAt(i);


        }

       return tersmetin;

    }


}
