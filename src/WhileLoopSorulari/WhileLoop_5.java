package WhileLoopSorulari;

public class WhileLoop_5 {

    public static void main(String[] args) {

        // While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun


        System.out.println(tersMetinMethodu("Sümeyra"));

    }
    public static String tersMetinMethodu(String metin) {
        String tersMetin="";
        int i=metin.length()-1;

        while (i>=0){

            tersMetin += metin.charAt(i);

            i--;
        }


      return tersMetin;

    }

}
