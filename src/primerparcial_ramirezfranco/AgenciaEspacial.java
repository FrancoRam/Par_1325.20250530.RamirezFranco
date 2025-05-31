
package primerparcial_ramirezfranco;

import java.util.ArrayList;
import java.util.Collections;


public class AgenciaEspacial {
    
    private String nombre;   
    private ArrayList<Nave> naves;
    
    public AgenciaEspacial() {
        this.nombre = "Agencia espacial SPACE X";
        naves = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void mostrarNaves()
    {
        if(naves.isEmpty())
        {
            System.out.println("No hay naves en la agencia espacial!");
        }
        else
        {
            for (Nave nave : naves) {
                System.out.println(nave.toString());
            }
        }
    }
    
    public void agregarNave(Nave nuevaNave)
    {
        if(naves.contains(nuevaNave))
        {
            System.out.println("No se puede agregar esta nave, ya se encuentra en la lista!!");
        }else{
            naves.add(nuevaNave);
            System.out.println("Nave agregada exitosamente!");
        }
    }
    
    
    public void iniciarExploracion()
    {
        for (Nave nave : naves) {
            nave.explorar();
        }
    }
    
    public void ordenarNavesPorNombre()
    {
        Collections.sort(naves);
        mostrarNaves();
    }
    
    public void ordenarNavesPorAnioDeLanzamiento()
    {
        Collections.sort(naves, new ComparadorAnio());
        mostrarNaves();
    }
    
    public void ordenarNavesPorTripulacion()
    {
        Collections.sort(naves, new ComparadorTripulacion());
        mostrarNaves();
    }
}
