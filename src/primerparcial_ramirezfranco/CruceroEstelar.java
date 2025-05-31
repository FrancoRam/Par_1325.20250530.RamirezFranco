
package primerparcial_ramirezfranco;

public class CruceroEstelar extends Nave{
    private int cantidadPasajeros;

   
    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Crucero estelar:" +
                "nombre='" + getNombre() + '\'' +
                ", capacidad de tripulacion=" + getCapacidadTripulacion() +
                ", año de lanzamiento=" + getAnioLanzamiento() +
                ", capacidad de pasajeros=" + cantidadPasajeros;
    
    }
    
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public void explorar() {
        System.out.println("El crucero estelar "+getNombre()+"NO puede realizar exploraciones");
    }
}
