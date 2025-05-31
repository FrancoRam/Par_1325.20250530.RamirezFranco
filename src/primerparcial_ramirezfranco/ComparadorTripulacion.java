
package primerparcial_ramirezfranco;

import java.util.Comparator;

public class ComparadorTripulacion implements Comparator<Nave>{

    //Ordenamiento descendente
    @Override
    public int compare(Nave o1, Nave o2) {
        return o2.getCapacidadTripulacion() - o1.getCapacidadTripulacion();
    }
    
}
