public class mükemmelSayi {
    public static void main(String[] args) {
        int number = 6;
        int remander = 0;
        int tamBölen = 0;


        for (int i = 1; i <= number/2; i++)// number sayısının yarısından sonra bakmaya gerek yok.
            {
            remander = number % i;
            if (remander == 0) {
                tamBölen += i;
            }
        }
        if(tamBölen==number)
        System.out.printf("%d sayısı mükemmel sayıdır.",number);
        else System.out.printf("%d sayısı mükemmel sayı değildir.",number);
    }
}
