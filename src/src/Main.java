import uade.edu.ar.gen.AlgoritmoGenomaHumano;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Holis");
        AlgoritmoGenomaHumano a = new AlgoritmoGenomaHumanoImpl();
        List<Integer> nucleotido = new ArrayList<>();
        nucleotido.add(3);
        nucleotido.add(6);
        nucleotido.add(7);
        List<Integer> nucleotido2 = new ArrayList<>();
        nucleotido2.add(5);
        nucleotido2.add(6);
        nucleotido2.add(7);
        List<Integer> nucleotido3 = new ArrayList<>();
        nucleotido3.add(2);
        nucleotido3.add(5);
        nucleotido3.add(9);
        List<Integer> nucleotido4 = new ArrayList<>();
        nucleotido4.add(2);
        nucleotido4.add(5);
        nucleotido4.add(9);
        List<List<Integer>> nucleotidos = new ArrayList<>();
        nucleotidos.add(nucleotido);
        nucleotidos.add(nucleotido2);
        nucleotidos.add(nucleotido3);
        nucleotidos.add(nucleotido4);
        int rangoDesde = 3566;
        int rangoHasta = 7599;

        List<Integer> resultado = a.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
        System.out.println(resultado);
    }
}