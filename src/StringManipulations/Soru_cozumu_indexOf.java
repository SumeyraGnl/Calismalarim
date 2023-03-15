package StringManipulations;

public class Soru_cozumu_indexOf {
    public static void main(String[] args) {
        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle = "Yasasin java, iyi ki java ogreniyorum,java";
        String kelime = "java";

        if (cumle.indexOf(kelime) == -1) {
            System.out.println("Aradiginiz kelime cumle icerisinde hic kullanılmamistir.");
        } else {
            int ilkIndex = cumle.indexOf(kelime); //8
            if (cumle.indexOf(kelime,ilkIndex + 1) == -1) {
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            } else {
                int ikinciIndex = cumle.indexOf(kelime,ilkIndex+1); //21
                if (cumle.indexOf(kelime,ikinciIndex + 1) == -1) {
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else{
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }


            }
        }
    }
}