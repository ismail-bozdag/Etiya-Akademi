public class CostomerManager {




    private ICostomerDal costomerDal;


    public CostomerManager(ICostomerDal costomerDal){

        this.costomerDal=costomerDal;
    }
        void add(){

            costomerDal.add();
        }

}
