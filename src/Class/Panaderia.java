package Class;

/**
 * Created by Mario on 14/07/2017.
 */
public class Panaderia {

    private String nombrePanaderia;
    private String direccionPanaderia;

    public Panaderia(String next) {
    }

    public Panaderia(String nombrePanaderia, String direccionPanaderia) {
        this.nombrePanaderia = nombrePanaderia;
        this.direccionPanaderia = direccionPanaderia;
    }

    public String getNombrePanaderia() {
        return nombrePanaderia;
    }

    public void setNombrePanaderia(String nombrePanaderia) {
        this.nombrePanaderia = nombrePanaderia;
    }

    public String getDireccionPanaderia() {
        return direccionPanaderia;
    }

    public void setDireccionPanaderia(String direccionPanaderia) {
        this.direccionPanaderia = direccionPanaderia;
    }
}
