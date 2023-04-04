package MultiDimensionalArrays;

public class MultiD_tumSayilarinCarpimi {
    public static void main(String[] args) {

        //Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int [][] arr = {{2,4,9,4},{6,9,7},{2,1,3,6}};

        System.out.println(tumSayilarinCarpimi(arr));
    }

    private static int tumSayilarinCarpimi(int[][] arr) {

        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                carpim *= arr[i][j];

            }

        }
        return carpim;
    }
}
