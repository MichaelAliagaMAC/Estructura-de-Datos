public class Servicio {
    private String tipoServicio;
    private String fecha;
    private String detalles;

    public Servicio(String tipoServicio, String fecha, String detalles) {
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
        this.detalles = detalles;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    @Override
    public String toString() {
        return "Servicio [Tipo: " + tipoServicio + ", Fecha: " + fecha + ", Detalles: " + detalles + "]";
    }
}
