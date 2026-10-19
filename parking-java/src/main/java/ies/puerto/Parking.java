package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Parking {
    static float tarifaHora = 1.50f;
    static int totalVehiculos = 0;
    static int totalHorasRegistradas = 0;
    static int totalCalculosTarifa = 0;
    static float importeTotalCalculado = 0f;
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido/a, " +nombre);

        mostrarMenu(teclado, nombre);




        teclado.close();
    }

    /**
     * Funcion que muestra un menú
     * @param teclado Variable que lee los inputs del usuario
     * @param nombre Variable que define el nombre del usuario
     */
    static void mostrarMenu (Scanner teclado, String nombre) {
        int opcion = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar vehículos");
            System.out.println("2. Calcular tarifa de estacionamiento");
            System.out.println("3. Mostrar resumen del día");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    registrarVehiculos();
                    break;

                case 2:
                    calcularTarifa();
                    break;

                case 3:
                    mostrarResumen (nombre);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar PARKING DAM-PRO");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion != 4);
    }

    /**
     * Funcion que registra los vehiculos y las horas de parking del usuario
     */
    static void registrarVehiculos () {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        float horas = 0;

        do {
            System.out.println("¿Cuántos vehículos quieres registrar?");
            cantidad = teclado.nextInt();
            if (cantidad < 0) {
                System.out.println("Debe ser un entero positivo");
            }
        } while (cantidad < 0);

        for (int contador = 1; contador <= cantidad ; contador++) {
            System.out.println("Vehículo " + contador);
            System.out.println("Introduce tu matrícula");
            String matricula = teclado.nextLine();
            teclado.nextLine();
            do {
                System.out.println("Introduce las horas estacionadas");
                horas = teclado.nextFloat();
                if (horas < 0) {
                    System.out.println("Las horas deben ser mayores que 0");
                }
            } while (horas < 0);

            totalVehiculos++;
            totalHorasRegistradas += horas;
        }

        System.out.println("Vehículos registrados en esta operación: " +cantidad);
        return;
    }

    /**
     * Funcion que calcula el importe del usuario
     */
    static void calcularTarifa () {
        Scanner teclado = new Scanner(System.in);

        if (totalHorasRegistradas <= 0) {
            System.out.println("Las horas deben ser mayores a 0, vuelve a la opción 1");
            return;
        }
        float importe = totalHorasRegistradas * tarifaHora;
        totalCalculosTarifa++;
        importeTotalCalculado += importe;
        System.out.println("Importe: " + importe + "euros");
        return;
    }

    /**
     * Funcion que muestra el resumen de lo que ha hecho el usuario
     * @param nombre Variable que define el nombre del usuario
     */
    static void mostrarResumen (String nombre) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: " +nombre);
        System.out.println("Vehículos registrados: " +totalVehiculos);
        System.out.println("Horas registradas: "+totalHorasRegistradas);
        System.out.println("Cálculos de tarifas: " +totalCalculosTarifa);
        System.out.println("Importe total calculado: " +importeTotalCalculado);
        return;

    }
}
