public class Cliente {
    private String numeroTelefono;
    private String nombre;

    public Cliente(String numeroTelefono, String nombre) {
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente [Número de Teléfono: " + numeroTelefono + ", Nombre: " + nombre + "]";
    }
}
