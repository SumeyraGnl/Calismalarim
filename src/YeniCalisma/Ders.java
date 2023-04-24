package YeniCalisma;

public class Ders {

    int sayi;
    String isim="Gulsum";
    int deger=30;


    @Override
    public String toString() {
        return "Ders{" +
                "sayi=" + sayi +
                ", isim='" + isim + '\'' +
                ", deger=" + deger +
                '}';
    }

    public Ders(int syi, String ism, int degr){

        sayi=10;
        isim="Rana";
        deger=12;



    }


    public static void main(String[] args) {

        Ders obj=new Ders(3,"Rana",10  );
        System.out.println(obj);
        System.out.println("deneme");
        System.out.println("deneme2");
    }

    }








