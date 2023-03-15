package MethodOlusturma;

public class MethodKullanma_2 {
    public static void main(String[] args) {

        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak

        String metin="Kabak";

        String tersMetin=MethodOlusturma_5.stringiTersineCevirme(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALİNDROMDUR");
        }else{
            System.out.println("Girilen metin PALİNDROM degildir");
        }
    }
}
