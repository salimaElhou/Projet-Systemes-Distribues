package ext;

import Dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp=80;
        return temp;
    }
}
