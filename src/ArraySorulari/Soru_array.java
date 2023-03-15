package ArraySorulari;

public class Soru_array {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdırın


        int[][] sayilar={{3,4,5},{1,2,3},{1,9},{4,5}};

        int a= sayilar[0][1];
        System.out.println(a);
        int b= sayilar[1][1];
        System.out.println(b);
        int c= sayilar[3][0];
        System.out.println(c);

        System.out.println("cift sayiların toplami: "+ (a+b+c));

        System.out.println("=============");

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                if (sayilar[i][j]%2==0){
                    toplam += sayilar[i][j];
                }

            }


        }
        System.out.println("cift sayilar toplami: " +toplam);

    }
}
