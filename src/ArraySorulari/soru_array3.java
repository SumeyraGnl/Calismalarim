package ArraySorulari;

public class soru_array3 {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        // toplaminini yazdirin

        int[][] sayilar={{3,4,7,5},{1,2,3},{1,5,9},{4,5}};


        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam += sayilar[i].length-1;
            }


        }

        System.out.println(toplam);


    }
}
