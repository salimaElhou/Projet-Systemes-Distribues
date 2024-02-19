package Pres;

import Dao.DaoImpl;
import ext.DaoImp2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
         Injection des dependances par instanciation statique =>new
         */
        DaoImp2 dao=new DaoImp2();
        MetierImpl metier=new MetierImpl(dao);
       // metier.setDao(dao);
        System.out.println("res ="+metier.calcul());
    }
}
