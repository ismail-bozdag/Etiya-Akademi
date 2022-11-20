public class EmailLogger extends BaseLogger {


    public void metot(){

        System.out.println("metot çalıştı");
    }

    public void log(String message) {

        System.out.println("Emaillere loglandı: " + message);
    }
}
