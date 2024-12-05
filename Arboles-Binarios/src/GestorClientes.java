import java.util.Scanner;

public class GestorClientes {
    private ArbolBinarioBusqueda arbolClientes = new ArbolBinarioBusqueda();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Clientes ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Buscar Cliente por Nombre");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Lista de Clientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    buscarClientePorNombre();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    public void agregarCliente() {
        System.out.print("Ingrese el número de teléfono del cliente: ");
        String numeroTelefono = scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el tipo de contrato del cliente (básico/ilimitado/max ilimitado): ");
        String tipoContrato = scanner.nextLine();
        Cliente cliente = new Cliente(numeroTelefono, nombre, direccion, tipoContrato);
        arbolClientes.insertar(cliente);
        System.out.println("Cliente agregado.");
    }

    public void buscarClientePorNombre() {
        System.out.print("Ingrese el nombre del cliente a buscar: ");
        String nombre = scanner.nextLine();
        Cliente cliente = arbolClientes.buscarPorNombre(nombre);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void actualizarCliente() {
        System.out.print("Ingrese el nombre del cliente a actualizar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la nueva dirección: ");
        String nuevaDireccion = scanner.nextLine();
        System.out.print("Ingrese el nuevo tipo de contrato: ");
        String nuevoTipoContrato = scanner.nextLine();

        boolean actualizado = arbolClientes.actualizarCliente(nombre, nuevaDireccion, nuevoTipoContrato);
        if (actualizado) {
            System.out.println("Cliente actualizado.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void listarClientes() {
        System.out.println("Lista de Clientes Registrados:");
        arbolClientes.listarClientes();
    }

    public static void main(String[] args) {
        GestorClientes gestor = new GestorClientes();
        gestor.menu();
    }
}
