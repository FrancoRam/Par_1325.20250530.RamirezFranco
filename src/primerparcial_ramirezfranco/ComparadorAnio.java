
package primerparcial_ramirezfranco;

import java.util.Comparator;


public class ComparadorAnio implements Comparator<Nave>{

    @Override
    public int compare(Nave o1, Nave o2) {
        return o2.getAnioLanzamiento() - o1.getAnioLanzamiento();
    }


    
}
