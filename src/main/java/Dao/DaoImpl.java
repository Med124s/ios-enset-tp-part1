package Dao;

/**
 * @author med20
 **/
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("*** Version Base de donner ***");
        double val = 445;
        return val;
    }
}
