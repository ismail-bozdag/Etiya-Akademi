public class sesliHarfler {
    public static void main(String[] args) {

        char harf = 'E';
        switch (harf) {

            case 'A': // Case'ler arası iki nokta kullanılıyor.
            case 'I':
            case 'O':
            case 'U':

                System.out.println("Kalın sesli harfdir.");
                break;
            default:
                System.out.println("İnce sesli harfdir.");

        }

    }
}
