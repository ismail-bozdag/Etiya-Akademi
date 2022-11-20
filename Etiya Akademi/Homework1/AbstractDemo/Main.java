public class Main {



    public static void main(String[] args) {


        CostomerManager costomerManager=new CostomerManager();
        costomerManager.databaseManager= new MySqlDatabaseManager();
        costomerManager.getCostomers();



    }
}