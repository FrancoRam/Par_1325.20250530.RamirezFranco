package primerparcial_ramirezfranco;

import java.util.Scanner;

/**
 *
 * @author RAMIREZ FRANCO - COMISION 325
 */
public class PrimerParcial_RamirezFranco {

    
    public static void main(String[] args) {
        AgenciaEspacial agencia = new AgenciaEspacial();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione una opcion del menu:");
            System.out.println("1. Agregar Nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por lanzamiento (desc) ");
            System.out.println("6. Mostrar naves ordenadas por tripulacion (desc)");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la Nave: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la capacidad de tripulacion: ");
                    int tripulacion = scanner.nextInt();
                    System.out.print("Ingrese su año de lanzamiento: ");
                    int anioLanzamiento = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Seleccione el tipo de NAVE: 1. Exploracion, 2. Carguero, 3. Crucero Estelar");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    switch (tipo) {
                        case 1:
                            System.out.print("Ingrese el tipo de exploracion: 1. CARTOGRAFIA, 2. INVESTIGACION, 3. CONTACTO ");
                            
                            int mision = scanner.nextInt();
                            EMision tipoExploracion = EMision.values()[mision - 1]; //Enumerados son indexados, por eso su indice es posicion -1
                            agencia.agregarNave(new NaveExploracion(tipoExploracion, nombre, tripulacion, anioLanzamiento));
                            break;
                        case 2:
                            System.out.print("Ingrese su capacidad de carga: ");
                            int carga = scanner.nextInt();
                            agencia.agregarNave(new NaveCarguero(carga, nombre, tripulacion, anioLanzamiento));
                            break;
                        case 3:
                            System.out.print("Ingrese la cantidad de pasajeros de Crucero Estelar: ");
                            int pasajeros = scanner.nextInt();
                            agencia.agregarNave(new CruceroEstelar(pasajeros, nombre, tripulacion, anioLanzamiento));
                            break;
                        default:
                            System.out.println("\u26A0 Opcion NO VALIDA.");
                    }
                    break;

                case 2:
                    agencia.mostrarNaves();
                    break;

                case 3:
                    agencia.iniciarExploracion();
                    break;
                case 4:
                    agencia.ordenarNavesPorNombre();
                    break;
                case 5:
                    //oreden descendente
                    agencia.ordenarNavesPorAnioDeLanzamiento();
                    break;
                case 6:
                    //orden descendente
                    agencia.ordenarNavesPorTripulacion();
                break;
                case 7:
                    salir = true;
                    break;
                

                default:
                    System.out.println("\u26A0 Opcion no valida. Intente de nuevo.");
            }
        }

        System.out.println("\nPrograma finalizado. ¡Gracias por usar el sistema de biblioteca!");
        scanner.close();
    }
        

        
    }
    
