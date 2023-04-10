package ForEachLoopSorulari;

import java.util.ArrayList;
import java.util.List;

public class ForEach_CiftTekKelimeYarisiYazdir {
    public static void main(String[] args) {

        // Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.

        String [] arr={"Istanbul","Ankara","Afyon","Kastamonu","Samsun","Manisa"};

        List<String> list= new ArrayList<>();

        for (String each:arr
             ) {
            if(each.length()%2==0){
                list.add(each.substring(0,each.length()/2));
            }else {
                list.add(each.substring(each.length()/2));
            }

        }

        System.out.println(list);


    }
}
