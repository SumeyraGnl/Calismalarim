package forLoopSorulari;

import java.util.Scanner;

public class forLoop_tersMetin {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen metin giriniz: ");
        String metin = scan.nextLine();
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);

            System.out.println(tersMetin);


        }
    }
}