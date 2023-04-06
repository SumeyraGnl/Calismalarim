package ArrayListSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_tekrarEdeniSil {
    public static void main(String[] args) {

        // Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        String[] arr = {"L", "M", "L", "P", "N", "P"};

        System.out.println(Arrays.toString(mukerrerOlaniSil(arr)));

    }

    public static String[] mukerrerOlaniSil(String[] arr) {

        List<String> liste = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!(liste.contains(arr[i]))) {
                liste.add(arr[i]);
            }


        }
        //System.out.println(liste);
        String[] yeniArr=new String[liste.size()];
        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=liste.get(i);

        }
        //System.out.println(Arrays.toString(yeniArr));
        return yeniArr;
    }
}
