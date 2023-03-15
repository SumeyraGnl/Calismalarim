package WhileLoopSorulari;

public class Whilw_loop_soru {
    public static void main(String[] args) {

        // 50 ve 100 arasindaki (sinirlar dahil) sayilari toplayin

        int toplam=0;
        int sayi=50;

        while(sayi>=50 && sayi<=100){

            toplam += sayi;
            sayi ++;

        }

        System.out.println("toplam : "+toplam);


    }
}
