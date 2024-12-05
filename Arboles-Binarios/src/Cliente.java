public class Cliente {
    private String numeroTelefono;
    private String nombre;
    private String direccion;
    private String tipoContrato;

    public Cliente(String numeroTelefono, String nombre, String direccion, String tipoContrato) {
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoContrato = tipoContrato;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Cliente [Número de Teléfono: " + numeroTelefono + ", Nombre: " + nombre + ", Dirección: " + direccion
                + ", Tipo de Contrato: " + tipoContrato + "]";
    }
}
