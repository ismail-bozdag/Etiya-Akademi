public class Main {
    public static void main(String[] args) {

        stockGir(25);
        int toplam = topla(29,86);
        int toplam2 = topla2(25,56,98,98,65,56,23);
        System.out.println(toplam);
        System.out.println(toplam2);

    }
    //Dönüşü olmayan void method

    public static void stockGir (int stock){
        System.out.println( stock + " Adet stok eklendi");
    }

    // Parametreli dönüşü olan method
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    // Variable Arguments ile Çalışmak
    public static int topla2 (int... sayilar){
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
}