public class Nodo {
    Cliente cliente;
    Nodo izquierda, derecha;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.izquierda = this.derecha = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
