package ArraySorulari;

public class Array_elemanVarmi {
    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[] arr={2,4,7,2,6,9,2,4};
        String[] arr1 = {"d","k","L","M","k","d"};

        elemanSayisiYazdir(arr,5);
        harfSayisiYazdir(arr1,"k");

    }

    public static void harfSayisiYazdir(String[] arr1,String arananHarf) {

        int sayac=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].equals(arananHarf)){
                sayac ++;

            }

        }
        if(sayac != 0){

            System.out.println(arananHarf + " harfi "+ sayac + " kez kullanilmistir");
        }else {
            System.out.println("Aradiginiz eleman array'de bulunmamaktadir.");
        }

    }

    public static void elemanSayisiYazdir(int[] arr, int arananSayi) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                sayac++;

            }
        }
        if (sayac != 0) {
            System.out.println(arananSayi + " sayisi " + sayac + " kez kullanilmistir");
        }else {
            System.out.println("Aradiginiz eleman array'de bulunmamaktadir.");
        }
    }
}
