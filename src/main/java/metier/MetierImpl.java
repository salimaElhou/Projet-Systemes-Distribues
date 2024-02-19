package metier;
import Dao.IDao;
import org.springframework.stereotype.Component;
@Component("metier") //bean
public class MetierImpl implements IMetier {
    private IDao dao;//couplage faible
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDao(IDao dao) {//pour injecter dans la var Dao un objet d'une classe qui implement interface IDao
        this.dao = dao;
    }
    public IDao getDao() {
        return dao;
    }
}
