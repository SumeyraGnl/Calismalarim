package ForEachLoopSorulari;

public class ForEach_KarelerToplami {
    public static void main(String[] args) {

        // Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        int[] arr = {2, 4, 6, 8, 9, 4, 2, 6, 7, 5, 8, 1, 3};

        karelerToplami(arr);


    }

    public static void karelerToplami(int[] arr) {

        int toplam=0;

        for (int each:arr
        ) {
            toplam += each*each;

        }
        System.out.println("Verilen Array'deki elementlerin kareleri toplami :" + toplam);
    }
}
