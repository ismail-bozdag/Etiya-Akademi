public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 17;
        int remander = 0;
        int tamBölen = 0;

        if (number == 1) {
            System.out.println(" 1 sayısı asal değildir.");
            return;
        }
        if (number < 1) {
            System.out.println("Sayı geçersizdir");
            return;
        }
        for (int i = 2; i < (number / 2); i++) {
            remander = number % i;
            if (remander == 0) {
                tamBölen++;
            }
        }

        if (tamBölen == 0) {
            System.out.printf("%d sayısı asaldır.",number);
        }
        else {
            System.out.printf("%d sayısı asal değildir.", number);
        }
    }
}

