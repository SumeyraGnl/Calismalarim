package ArrayListSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_istenmeyenHarf {
    public static void main(String[] args) {

        // ======TARIM KALDI TAMAMLA=======


        //Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        List<String> list = new ArrayList<>(Arrays.asList("Ankara","İzmir","Bursa","Afyon"));

        istenmeyeniSil(list,"a");
    }

    public static List<String> istenmeyeniSil(List<String> list, String istenmeyenHarf) {



        return list;
    }
}
