package Class;

/**
 * Created by Mario on 14/07/2017.
 */
public class Pedido {

    private String tipoPedido;
    private boolean conFactura;

    public Pedido (String next)
    {

    }
    public Pedido(String tipoPedido, boolean conFactura) {
        this.tipoPedido = tipoPedido;
        this.conFactura = conFactura;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public boolean isConFactura() {
        return conFactura;
    }

    public void setConFactura(boolean conFactura) {
        this.conFactura = conFactura;
    }
}
