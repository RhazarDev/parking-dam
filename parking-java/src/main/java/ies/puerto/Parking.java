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
    static int opcion = 0;

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido/a, " +nombre);

        mostrarMenu();




        teclado.close();
    }
    static void mostrarMenu () {
        Scanner teclado = new Scanner(System.in);
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

                case 4:

                default:
            }

        } while (opcion != 4);

    }

    static void registrarVehiculos () {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        int matricula = 0;
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
            matricula = teclado.nextInt();
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

    static void calcularTarifa () {
        Scanner teclado = new Scanner(System.in);
        float horasTarifa = 0;

        do {
            System.out.println("Inserte las horas para calcular la tarifa");
            horasTarifa = teclado.nextFloat();
            if (horasTarifa <= 0) {
                System.out.println("Las horas deben ser mayores que 0");
            }
        } while (horasTarifa <= 0);

        float importe = horasTarifa * tarifaHora;
        totalCalculosTarifa++;
        importeTotalCalculado += importe;
        System.out.println("Importe: " + importe + "euros");
    }

    static void mostrarResumen (String nombre) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario" +nombre);

    }
}
