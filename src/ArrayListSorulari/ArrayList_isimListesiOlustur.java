package ArrayListSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_isimListesiOlustur {

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        // liste olarak dondurecek bir method olusturun.



        isimListele();
    }

    public static List<String> isimListele() {
        String isim="";
        List<String> isimler = new ArrayList<>();

        while (isim.equalsIgnoreCase("Q")){
            System.out.println("Lutfen bir isim giriniz.\nisleminizi bitirmek icin Q'ya basiniz.");

            isim = scan.nextLine();

            if(!isim.equalsIgnoreCase("q")){

                isimler.add(isim);
            }

        }
        return isimler;

    }

}
