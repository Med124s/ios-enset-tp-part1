package Metier;

import Dao.IDao;

/**
 * @author med20
 **/
public class MetierImpl2 implements IMetier {
    // Couplage Faible
    private IDao dao = null;

    public MetierImpl2(){
    }

    public MetierImpl2(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double res = dao.getData();
        return res * 3;
    }
}
