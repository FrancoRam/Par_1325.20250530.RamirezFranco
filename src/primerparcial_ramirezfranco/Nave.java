
package primerparcial_ramirezfranco;

import java.util.Collections;
import java.util.Objects;

public abstract class Nave implements Comparable<Nave>{

    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    @Override
    public abstract String toString();
    
//    Hice este metodo estático porque me parecio más general, y aunque por contrato 
//    debe implementarlo la clase Crucero Estelar, la sobrecarga del metodo muestra por consola que el "no puede explorar"
//    La otra opcion que baraje era no hacer este metodo abstracto y evaluar cuando recorro con el foreach si no es una instancia de Crucero estelar
    public abstract void explorar();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Nave nave) {
            return this.nombre.equals(nave.nombre) && this.anioLanzamiento == nave.anioLanzamiento;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioLanzamiento);
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public int compareTo(Nave otraNave) {
        return this.nombre.compareTo(otraNave.getNombre());
    }
    
    
}
