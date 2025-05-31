
package primerparcial_ramirezfranco;

public class NaveExploracion extends Nave{
    
    private EMision tipoMision;

    

    public NaveExploracion(EMision tipoMision, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    @Override
    public String toString() {
        return "Nave Exploracion:" +
                "nombre='" + getNombre() + '\'' +
                ", capacidad de tripulacion=" + getCapacidadTripulacion() +
                ", año de lanzamiento=" + getAnioLanzamiento() +
                ", tipo de mision=" + tipoMision.toString();
    }
    
    public EMision getTipoMision() {
        return tipoMision;
    }

    @Override
    public void explorar() {
        System.out.println("El explorador "+getNombre()+" ha comenzado la mision de exploracion!");
    }
}
