public class ArbolBinarioBusqueda {
    Nodo raiz;

    public void insertar(Cliente cliente) {
        raiz = insertarRecursivo(raiz, cliente);
    }

    private Nodo insertarRecursivo(Nodo raiz, Cliente cliente) {
        if (raiz == null) {
            raiz = new Nodo(cliente);
            return raiz;
        }

        if (cliente.getNombre().compareTo(raiz.getCliente().getNombre()) < 0)
            raiz.setIzquierda(insertarRecursivo(raiz.getIzquierda(), cliente));
        else if (cliente.getNombre().compareTo(raiz.getCliente().getNombre()) > 0)
            raiz.setDerecha(insertarRecursivo(raiz.getDerecha(), cliente));

        return raiz;
    }

    public Cliente buscarPorNombre(String nombre) {
        return buscarPorNombreRecursivo(raiz, nombre);
    }

    private Cliente buscarPorNombreRecursivo(Nodo raiz, String nombre) {
        if (raiz == null)
            return null;

        if (raiz.getCliente().getNombre().equals(nombre))
            return raiz.getCliente();

        Cliente encontrado = buscarPorNombreRecursivo(raiz.getIzquierda(), nombre);
        if (encontrado != null)
            return encontrado;

        return buscarPorNombreRecursivo(raiz.getDerecha(), nombre);
    }

    public boolean actualizarCliente(String nombre, String nuevaDireccion, String nuevoTipoContrato) {
        Cliente cliente = buscarPorNombre(nombre);
        if (cliente != null) {
            cliente.setDireccion(nuevaDireccion);
            cliente.setTipoContrato(nuevoTipoContrato);
            return true;
        }
        return false;
    }

    public void listarClientes() {
        listarClientesRecursivo(raiz);
    }

    private void listarClientesRecursivo(Nodo raiz) {
        if (raiz != null) {
            listarClientesRecursivo(raiz.getIzquierda());
            System.out.println(raiz.getCliente());
            listarClientesRecursivo(raiz.getDerecha());
        }
    }
}
