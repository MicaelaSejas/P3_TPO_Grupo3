import uade.edu.ar.gen.AlgoritmoGenomaHumano;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoGenomaHumanoImpl implements AlgoritmoGenomaHumano {
    public AlgoritmoGenomaHumanoImpl() {
    }

    public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta) {
        List<Integer> solucion = new ArrayList<Integer>();
        recorrido(nucleotidos, rangoDesde, rangoHasta, 0, 0, solucion);
        return solucion;
    }

    public List<Integer> recorrido(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta,
                                   int numeroActual, int indice, List<Integer> solucion) {
        List<Integer> nucleotido = nucleotidos.get(indice);
        int nucleotidosSize = nucleotidos.size();
        int nucleotidoSize = nucleotido.size();
        
        for(int j = 0; j < nucleotidoSize; j++){
            int numeroCandidato = numeroActual * 10 + nucleotido.get(j);
            if (indice == nucleotidosSize-1){
                if (numeroCandidato >= rangoDesde && numeroCandidato <= rangoHasta){
                    solucion.add(numeroCandidato);
                }
            }
            else {
                int potencia = (int) Math.pow(10, (nucleotidosSize-indice-1));
                int valorHasta = numeroCandidato * potencia;
                int valorDesde = valorHasta + potencia - 1;
                if (valorHasta <= rangoHasta && valorDesde >= rangoDesde) {
                    recorrido(nucleotidos, rangoDesde, rangoHasta, numeroCandidato, indice+1, solucion);
                }
            }
        }
        return solucion;
    }
}
