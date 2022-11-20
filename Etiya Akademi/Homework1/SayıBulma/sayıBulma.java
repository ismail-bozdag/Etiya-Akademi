public class sayıBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 7, 9, 5, 6};
        int aranacak = 11;
        boolean varMi = false;
        for (int sayi : sayilar) {

            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
            if(varMi){
                System.out.println("Sayı mevcuttur.");
            }
            else System.out.println("Sayı mevcut değildir");
        }
    }