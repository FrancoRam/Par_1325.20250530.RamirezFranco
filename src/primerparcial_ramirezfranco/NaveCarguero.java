
package primerparcial_ramirezfranco;


public class NaveCarguero extends Nave{
    
    private int capacidadCarga;
    static final int MAX_CAPACIDAD_CARGA=500;
    static final int MIN_CAPACIDAD_CARGA=100;
    
    
    public NaveCarguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }
    

    @Override
    public String toString() {
        return "Nave Carguero:" +
                "nombre='" + getNombre() + '\'' +
                ", capacidad de tripulacion=" + getCapacidadTripulacion() +
                ", año de lanzamiento=" + getAnioLanzamiento() +
                ", capacidad de carga=" + capacidadCarga;
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    
    public void validarCarga(int carga)
    {
        if(carga >= MIN_CAPACIDAD_CARGA || carga <= MAX_CAPACIDAD_CARGA)
        {
            this.capacidadCarga = carga;
        }else if (carga > MAX_CAPACIDAD_CARGA) {
            this.capacidadCarga = MAX_CAPACIDAD_CARGA;
        }else if (carga < MIN_CAPACIDAD_CARGA) {
            this.capacidadCarga = MIN_CAPACIDAD_CARGA;
        }
    }

    @Override
    public void explorar() {
        System.out.println("El carguero "+getNombre()+" ha iniciado la exploracion");
    }
    
    
}
