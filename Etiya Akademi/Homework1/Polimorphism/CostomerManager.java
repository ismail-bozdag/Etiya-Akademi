public class CostomerManager {

    private BaseLogger logger;

    public CostomerManager(BaseLogger logger){
        this.logger=logger;
    }

    public void add(){

        System.out.println("Müşteri Eklendi.");
        this.logger.log("mesaj");


    }
}
