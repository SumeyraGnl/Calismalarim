package ForEachLoopSorulari;

import java.util.ArrayList;
import java.util.List;

public class ForEach_ArrayKarsilastirma {
    public static void main(String[] args) {

         /*
            Soru 5-Verilen iki array’in elementlerini karsilastirip,
                   ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.
         */

        int[] arr1 = {2, 4, 6, 8, 9, 4, 2, 6, 7, 5, 8, 1, 3};
        int[] arr2 = {12, 34, 4, 6, 7, 2, 45, 77, 8, 10, 3};

        List<Integer> ortakElementler= new ArrayList<>();

        for (int each1:arr1
             ) {
            for (int each2:arr2
                 ) {

                if(each1==each2 && !ortakElementler.equals(each1)){

                    ortakElementler.add(each1);
                }

            }

        }
        System.out.println(ortakElementler);

    }
}
