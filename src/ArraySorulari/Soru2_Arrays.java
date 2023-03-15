package ArraySorulari;

public class Soru2_Arrays {
    public static void main(String[] args) {

        // String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.

        String[] isimler={"Kemal", "Jonathan", "Mark", "Angie", "Veli","Neriman"};


        for (int i = 0; i < isimler.length; i++) {

            if(isimler[i].endsWith("n") || isimler[i].endsWith("k")){

                System.out.println(isimler[i].substring(0, 1));
            }




        }



    }
}
