public class Cliente {
    private String Nombre;
    private String TipoLinea;
    private String Operador;
    private String CostoMensual;

    public Cliente(String Nombre, String TipoLinea, String Operador, String CostoMensual) {
        this.Nombre = Nombre;
        this.TipoLinea = TipoLinea;
        this.Operador = Operador;
        this.CostoMensual = CostoMensual;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipoLinea() {
        return TipoLinea;
    }

    public String getOperador() {
        return Operador;
    }

    public String getCosstoMensual() {
        return CostoMensual;
    }

    @Override
    public String toString() {
        return "Cliente [Nombres y Apellidos: " + Nombre + ", Tipo de Liena: " + TipoLinea + ", Operador: "
                + Operador
                + ", Costo Mensual: "
                + CostoMensual + "]";
    }
}
