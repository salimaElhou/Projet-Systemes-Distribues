package Dao;

import org.springframework.stereotype.Component;

@Component("dao")// spring au demarage
public class DaoImpl implements IDao{


    @Override
    public double getData() {
        /*
        Se connecter a la BD pour recup la temp"rature
        **/
        System.out.println("version BD");
        double temp=Math.random()*40;
        return temp;
    }
}
