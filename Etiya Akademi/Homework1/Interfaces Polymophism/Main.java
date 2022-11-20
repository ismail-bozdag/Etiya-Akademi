public class Main {


    public static void main(String[] args) {

        CostomerManager costomerManager = new CostomerManager(new OracleCostomerDal());

        costomerManager.add();



    }
}