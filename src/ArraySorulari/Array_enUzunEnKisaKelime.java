package ArraySorulari;

public class Array_enUzunEnKisaKelime {
    public static void main(String[] args) {
        //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] arr={"isim","soyisim","telefon","adres","kimlikno"};

        enUzunEnKisaKElimeBul(arr);

    }
    public static void enUzunEnKisaKElimeBul(String[] arr) {

        String enUzun=arr[1];
        String enKisa=arr[2];


        for (String each:arr
        ) {

            if(each.length()>enUzun.length()){
                enUzun=each;

            }
            if(each.length()<enKisa.length()){
                enKisa=each;
            }
        }
        System.out.println("En uzun kelime: "+ enUzun+ "\nEn kisa kelime: "+enKisa);


/*
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }
            if(arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }

        }

        System.out.println("En uzun kelime: "+ enUzun+ "\nEn kisa kelime: "+enKisa);

 */





    }


}
