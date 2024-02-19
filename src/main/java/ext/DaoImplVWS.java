package ext;

import Dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version WEB SERVICE");
        return 90;
    }
}
