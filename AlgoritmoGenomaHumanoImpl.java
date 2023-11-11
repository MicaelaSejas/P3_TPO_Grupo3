

import uade.edu.ar.gen.AlgoritmoGenomaHumano;

import java.util.List;

public class AlgoritmoGenomaHumanoImpl implements AlgoritmoGenomaHumano {
    public AlgoritmoGenomaHumanoImpl() {
    }

    public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta) {
        return null;
    }

    public List<Integer> recorrido(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta,
                                   int numeroActual, int indice, List<Integer> solucion) {
        List<Integer> nucleotido = nucleotidos.get(indice);

        for(int j = 0; j < nucleotido.size() - 1; j++){
            int numeroCandidato = numeroActual * 10 + nucleotido.get(j);
            if (indice == nucleotidos.size()){
                if (numeroCandidato >= rangoDesde && numeroCandidato <= rangoHasta){
                    solucion.add(numeroCandidato);
                }
            }
            else {
                int valorNC = numeroCandidato * 10^(nucleotidos.size()-indice-1);
                if (valorNC <= rangoHasta && (valorNC+9)>= rangoDesde) {
                    recorrido(nucleotidos, rangoDesde, rangoHasta, numeroCandidato, indice, solucion);
                }
            }
        }
        return solucion;
    }
}
