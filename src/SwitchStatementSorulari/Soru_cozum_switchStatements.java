package SwitchStatementSorulari;

import java.util.Scanner;

public class Soru_cozum_switchStatements {
    public static void main(String[] args) {

        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gün numarasını giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo) {
            case(1):
            case(2):
            case(3):
            case(4):
            case(5):
                System.out.println("Hafta ici");
                break;
            case(6):
            case(7):
                System.out.println("Hafta sonu");
                break;
            default:
                    System.out.println("Gecersiz numara");

        }





        }





    }

