package metier;

import org.junit.Assert;
import org.junit.Test;

public class calculTest {
    private Calcul calcul;
    @Test
    public void testsomme(){
        calcul = new Calcul();
        double a=5; double b=9;
        double expected=14;
        double res = calcul.somme(a,b);
        Assert.assertTrue(res == expected);// si res = expected donc le test est true sinon false

    }
}
