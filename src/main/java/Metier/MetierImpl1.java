package Metier;

import Dao.IDao;

/**
 * @author med20
 **/
public class MetierImpl1 implements IMetier{
    //c'est le couplage faible
    private IDao dao = null;

    public MetierImpl1() {
    }

    public MetierImpl1(IDao dao) {
        this.dao = dao;
    }

    // Pour injecter la variable dao, un object d'une class qui implément l'interface IDAO
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double res = dao.getData();
        return res * 10;
    }
}
