package SwitchStatementSorulari;

import java.util.Scanner;

public class Soru_cozum_switchStatements2 {
    public static void main(String[] args) {

        // Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen anlamini ögrenmek istediginiz harfi giriniz");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf);

        switch (harf){
            case('I'):
                System.out.println("I : International");
                break;
            case('S'):
                System.out.println("S : Software");
                break;
            case('T'):
                System.out.println("T : Testing");
                break;
            case('Q'):
                System.out.println("Q : Qualifications");
                break;
            case('B'):
                System.out.println("B: Board");
                break;
            default:
                System.out.println("Gecersiz harf");
        }





    }
}
