package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Parking {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        float tarifaHora = 1.50f;
        int totalVehiculos = 0;
        int totalHorasRegistradas = 0;
        int totalCalculosTarifa = 0;
        float importeTotalCalculado = 0f;
        int opcion = 0;

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar vehículos");
            System.out.println("2. Calcular tarifa de estacionamiento");
            System.out.println("3. Mostrar resumen del día");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                case 2:

                case 3:

                case 4:

                default:
            }

        } while (opcion != 4)



        teclado.close();
    }

    public void
}
