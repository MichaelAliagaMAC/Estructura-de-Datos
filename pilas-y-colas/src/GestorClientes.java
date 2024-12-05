import java.util.Scanner;

public class GestorClientes {
    private PilaClientes PilaClientes = new PilaClientes();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Clientes ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Eliminar Cliente Más Reciente");
            System.out.println("3. Ver Lista de Clientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    eliminarCliente();
                    break;
                case 3:
                    verListaClientes();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public void agregarCliente() {
        System.out.print("Ingrese los nombres y apellidos del cliente: ");
        String Nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de linea (prepago/postpago): ");
        String TipoLinea = scanner.nextLine();
        System.out.print("Ingrese el operador móvil: ");
        String Operador = scanner.nextLine();
        System.out.print("Ingrese el costo mensual: ");
        String CostoMensual = scanner.nextLine();
        Cliente tarea = new Cliente(Nombre, TipoLinea, Operador, CostoMensual);
        PilaClientes.push(tarea);
        System.out.println("Cliente agregado.");
    }

    public void eliminarCliente() {
        Cliente tarea = PilaClientes.pop();
        if (tarea != null) {
            System.out.println("Cliente eliminado: " + tarea);
        }
    }

    public void verListaClientes() {
        PilaClientes.verTodosLosClientes();
    }

    public static void main(String[] args) {
        GestorClientes gestor = new GestorClientes();
        gestor.menu();
    }
}
