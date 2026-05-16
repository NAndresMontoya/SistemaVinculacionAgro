import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Solicitud solicitud = null;

        int opcion;

        do {

            System.out.println("=== SISTEMA DE VINCULACION AGRO ===");
            System.out.println("1. Crear solicitud");
            System.out.println("2. Ver solicitud registrada");
            System.out.println("3. Aceptar solicitud");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese nombre del productor: ");
                    String productor = scanner.nextLine();

                    System.out.print("Ingrese tipo de maquinaria: ");
                    String maquinaria = scanner.nextLine();

                    System.out.print("Describa el problema: ");
                    String problema = scanner.nextLine();

                    System.out.print("Ingrese ubicacion: ");
                    String ubicacion = scanner.nextLine();

                    System.out.print("Ingrese nivel de urgencia: ");
                    String urgencia = scanner.nextLine();

                    solicitud = new Solicitud(
                            productor,
                            maquinaria,
                            problema,
                            ubicacion,
                            urgencia
                    );

                    System.out.println("Solicitud creada correctamente.");
                    break;

                case 2:

                    if (solicitud == null) {

                        System.out.println("No hay solicitudes registradas.");

                    } else {

                        solicitud.mostrarSolicitud();

                    }

                    break;

                case 3:

                    if (solicitud == null) {

                        System.out.println("No hay solicitudes pendientes.");

                    } else {

                        solicitud.aceptarSolicitud();

                    }

                    break;

                case 4:

                    System.out.println("Saliendo del sistema.");
                    break;

                default:

                    System.out.println("Opcion invalida.");

            }

            System.out.println();

        } while (opcion != 4);

        scanner.close();

    }

}