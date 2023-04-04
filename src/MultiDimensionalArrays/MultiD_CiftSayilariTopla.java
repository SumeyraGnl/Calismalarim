package MultiDimensionalArrays;

public class MultiD_CiftSayilariTopla {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int [][] arr = {{2,4,9,4},{6,9,8},{2,1,3,6}};

        ciftSayilariTopla(arr);
    }

    public static void ciftSayilariTopla(int [][] arr ) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]%2==0){

                    toplam+=arr[i][j];
                }

            }

        }
        System.out.println(toplam);



    }
}
