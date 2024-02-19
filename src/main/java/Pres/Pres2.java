package Pres;

import Dao.IDao;
import metier.IMetier;

import java.io.File;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName =scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();

        String metierClassNme = scanner.nextLine();
        Class cMetier = Class.forName(metierClassNme);
        IMetier metier=(IMetier) cMetier.newInstance();
        //System.out.println(dao.getData());

        Method method= cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao) j invole la methode setDao sur l obj metier et param dao
        method.invoke(metier,dao);
        System.out.println("res =" +metier.calcul());

    }
}
