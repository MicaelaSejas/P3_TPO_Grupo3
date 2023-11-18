import org.junit.Test;

import java.util.List;

public class AlgoritmoGenomaHumanoImplTest {
    public AlgoritmoGenomaHumanoImplTest() {
    }

    @Test
    public void encontrarNumerosConNucleotidosDe5Cifras() {
        long startTime = System.currentTimeMillis();
        AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImpl();
        algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
        long endTime = System.currentTimeMillis() - startTime;
    }

    @Test
    public void encontrarNumerosConNucleotidosDe10Cifras() {
        long startTime = System.currentTimeMillis();
        AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImpl();
        algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
        long endTime = System.currentTimeMillis() - startTime;
    }

    @Test
    public void encontrarNumerosConNucleotidosDe50Cifras() {
        long startTime = System.currentTimeMillis();
        AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImpl();
        algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
        long endTime = System.currentTimeMillis() - startTime;
    }

    @Test
    public void encontrarNumerosConNucleotidosDe100Cifras() {
        long startTime = System.currentTimeMillis();
        AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImpl();
        algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
        long endTime = System.currentTimeMillis() - startTime;
    }
}