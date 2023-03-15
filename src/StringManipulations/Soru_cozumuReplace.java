package StringManipulations;

public class Soru_cozumuReplace {
    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €

        double sayi=15.3;

        String input1="15.30 €";
        String input2="11.40 €";

        input1=input1.replace(" €","");
        input2=input2.replace(" €","");


        double inp1 = Double.parseDouble(input1);
        System.out.println(inp1);
        double inp2 = Double.parseDouble(input2);
        System.out.println((inp1+inp2) + " €");


    }
}
