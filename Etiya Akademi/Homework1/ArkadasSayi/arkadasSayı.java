public class arkadasSayı {
    public static void main(String[] args) {
        int number = 220;
        int number2= 284;
        int remander = 0;
        int remander2 = 0;
        int tamBölen = 0;
        int tamBölen2 = 0;


        for (int i = 1; i <= number/2; i++)// number sayısının yarısından sonra bakmaya gerek yok.
        {
            remander = number % i;
            if (remander == 0) {
                tamBölen += i;
            }
        }
        for (int i = 1; i <= number2/2; i++)// number sayısının yarısından sonra bakmaya gerek yok.
        {
            remander = number % i;
            if (remander == 0) {
                tamBölen2 += i;
            }
        }
        System.out.println(tamBölen);
        System.out.println(tamBölen2);

        if(tamBölen==tamBölen2)
            System.out.printf("%d sayısı ile %d sayısı arkadaş sayıdır.",number, number2);
        else System.out.printf("%d sayısı ile %d sayısı arkadaş sayı değildir.",number, number2);
    }
}
