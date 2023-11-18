import java.util.*;

public class AlgoritmoGenomaHumanoImpl implements AlgoritmoGenomaHumano {
    public AlgoritmoGenomaHumanoImpl() {
    }

    public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta) {
        List<Integer> solucion = new ArrayList<>();
        int carHasta = Integer.toString(rangoHasta).length();
        if (rangoDesde > rangoHasta || carHasta > nucleotidos.size() || rangoDesde < 0) {
            return solucion;
        }

        List<List<Integer>> nucleotidosSinDuplicados = new ArrayList<>();
        for (List<Integer> nucleotido : nucleotidos){
            Set<Integer> conjuntoSinDuplicados = new HashSet<>(nucleotido);
            nucleotidosSinDuplicados.add(new ArrayList<>(conjuntoSinDuplicados));
        }

        int nucleotidosSize = nucleotidos.size();

        for (int i = 0; i < nucleotidosSize - carHasta; i++) {
            int corte = i+carHasta;
            recorrido(nucleotidosSinDuplicados.subList(i, corte), rangoDesde, rangoHasta, 0, 0, solucion);
        }

        Set<Integer> conjuntoSinDuplicados = new HashSet<>(solucion);
        return new ArrayList<>(conjuntoSinDuplicados);
    }

    public List<Integer> recorrido(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta,
                                   int numeroActual, int indice, List<Integer> solucion) {
        List<Integer> nucleotido = nucleotidos.get(indice);
        int nucleotidosSize = nucleotidos.size();
        int nucleotidoSize = nucleotido.size();

        for (Integer numero : nucleotido) {
            int numeroCandidato = numeroActual * 10 + numero;

            // El or permite que el rango desde tenga menos digitos que el rango hasta, en caso de no requerirse
            // puede simplemente eliminarse el '|| numeroCandidato >= rangoDesde'
            if (indice == nucleotidosSize - 1 || numeroCandidato >= rangoDesde) {

                if (numeroCandidato >= rangoDesde && numeroCandidato <= rangoHasta) {
                    solucion.add(numeroCandidato);
                }
            } else {
                int potencia = (int) Math.pow(10, (nucleotidosSize - indice - 1));
                int valorHasta = numeroCandidato * potencia;
                int valorDesde = valorHasta + potencia - 1;

                if (valorHasta <= rangoHasta && valorDesde >= rangoDesde) {
                    recorrido(nucleotidos, rangoDesde, rangoHasta, numeroCandidato, indice + 1, solucion);
                }
            }
        }
        return solucion;
    }
}
