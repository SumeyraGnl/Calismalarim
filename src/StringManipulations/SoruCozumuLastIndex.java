package StringManipulations;

public class SoruCozumuLastIndex {
    public static void main(String[] args) {

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis


        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "cok";


        if (cumle.indexOf(kelime) == -1) {
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            } else {
                System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
            }
        }
    }
