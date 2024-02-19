package Presentation;

import Dao.DaoImpl;
import Dao.IDao;
import Metier.MetierImpl1;

/**
 * @author med20
 **/
public class PresAvecInstStatique {

    public static void main(String[] args) {
        /* Injection des dépendences par Instanciation Statique utilisant new */
        IDao dao = new DaoImpl();
        //Injection via le constructor
        MetierImpl1 metier = new MetierImpl1(dao);

        /*Injection via le setter*/
        //metier.setDao(dao);
        System.out.println("Res: "+metier.calcul());

    }
}
