package Class;

/**
 * Created by Mario on 14/07/2017.
 */
public class Equipo
{
    private String tipoEquipo;
    private int cantidadEquipo;

    public Equipo (String next)
    {

    }
    public Equipo(String tipoEquipo, int cantidadEquipo) {
        this.tipoEquipo = tipoEquipo;
        this.cantidadEquipo = cantidadEquipo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public int getCantidadEquipo() {
        return cantidadEquipo;
    }

    public void setCantidadEquipo(int cantidadEquipo) {
        this.cantidadEquipo = cantidadEquipo;
    }
}
