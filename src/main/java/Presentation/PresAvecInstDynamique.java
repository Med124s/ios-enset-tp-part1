package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author med20
 **/
public class PresAvecInstDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao dao = (IDao) cdao.getConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cmetier.getConstructor().newInstance();

        Method setDao = cmetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);

        System.out.println("RES="+metier.calcul());
    }
}
