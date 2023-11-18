import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlgoritmoGenomaHumano a = new AlgoritmoGenomaHumanoImpl();
        List<List<Integer>> nucleotidos = new ArrayList<>();
        nucleotidos.add(List.of(3,6,7,4));
        nucleotidos.add(List.of(3,8,9));
        nucleotidos.add(List.of(4,5,2));
        nucleotidos.add(List.of(8,7,7));
        nucleotidos.add(List.of(3,2,1));
        nucleotidos.add(List.of(3,4,8));
        nucleotidos.add(List.of(3,7,9));
        nucleotidos.add(List.of(8,4,5));
        int rangoDesde = 35;
        int rangoHasta = 754;

        List<Integer> resultado = a.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
        System.out.println(resultado);
    }
}