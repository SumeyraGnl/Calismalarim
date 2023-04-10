package ForEachLoopSorulari;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach_TekrarEdeniSil {
    public static void main(String[] args) {
        // Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr={2,4,6,8,9,4,2,6,7,5,8,1,3};

        List<Integer> list=new ArrayList<>();

        for (int each:arr
             ) {
            if(!list.contains(each)){

                list.add(each);
            }

        }
        int[] yeniarr=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {

            yeniarr[i]=list.get(i);

        }
        System.out.println(Arrays.toString(yeniarr));


    }
}
