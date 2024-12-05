import java.util.HashMap;
import java.util.Scanner;

public class GestorHistorial {
    private HashMap<String, ListaServicios> historialClientes = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Historial de Servicios ---");
            System.out.println("1. Agregar Servicio a un Cliente");
            System.out.println("2. Mostrar Historial de Servicios de un Cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarServicioACliente();
                    break;
                case 2:
                    mostrarHistorialDeCliente();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    public void agregarServicioACliente() {
        System.out.print("Ingrese el número de teléfono del cliente: ");
        String numeroTelefono = scanner.nextLine();

        System.out.print("Ingrese el tipo de servicio (básico/max ilimitado/ilimitado): ");
        String tipoServicio = scanner.nextLine();
        System.out.print("Ingrese la fecha del servicio: ");
        String fecha = scanner.nextLine();
        System.out.print("Ingrese los detalles del servicio (plan existente/plan no existente): ");
        String detalles = scanner.nextLine();
        Servicio servicio = new Servicio(tipoServicio, fecha, detalles);

        ListaServicios listaServicios;
        if (historialClientes.containsKey(numeroTelefono)) {
            listaServicios = historialClientes.get(numeroTelefono);
        } else {
            listaServicios = new ListaServicios();
            historialClientes.put(numeroTelefono, listaServicios);
        }
        listaServicios.agregarServicio(servicio);
        System.out.println("Servicio agregado al historial del cliente.");
    }

    public void mostrarHistorialDeCliente() {
        System.out.print("Ingrese el número de teléfono del cliente: ");
        String numeroTelefono = scanner.nextLine();
        if (historialClientes.containsKey(numeroTelefono)) {
            System.out.println("Historial de servicios para el cliente con número de teléfono: " + numeroTelefono);
            historialClientes.get(numeroTelefono).mostrarServicios();
        } else {
            System.out.println("No se encontró el historial de servicios para el cliente con número de teléfono: "
                    + numeroTelefono);
        }
    }

    public static void main(String[] args) {
        GestorHistorial gestor = new GestorHistorial();
        gestor.menu();
    }
}
