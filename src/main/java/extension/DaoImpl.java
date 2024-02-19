package extension;

import Dao.IDao;

/**
 * @author med20
 **/
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("*** Version Web Service ***");
        double val = 26;
        return val;
    }
}
