public class Main {
    public static void main(String[] args) {

//        ConsoleLogger ahmet = new ConsoleLogger();
//        EmailLogger loglama =new EmailLogger();
//        DatabaseLogger loglamak = new DatabaseLogger();
//
//        loglama.log("Log mesajı");
//        loglamak.log("");
//
//
//        EmailLogger ahmett =new EmailLogger();
//        ahmett.log("mesaj");
//
//        BaseLogger[] loglar =new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
//
//        for(BaseLogger loggers:loglar ){
//
//            loggers.log("log mesajı");
//        }

        CostomerManager costomerManager=new CostomerManager(new EmailLogger());
        costomerManager.add();
    }
}