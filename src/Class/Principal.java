package Class;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario on 14/07/2017.
 */
public class Principal {

        private Pedido[] listado;
        private List<Equipo> listadoEquipo;
        private Panaderia panaderia;
        private int cantPedidos;

        public Principal(int cantPedidos) {
            listado = new Pedido[cantPedidos];
            cantPedidos = 0;
            listadoEquipo=new ArrayList<>();

        }

        public Pedido[] getListado() {
            return listado;
        }

        public void setListado(Pedido[] listado) {
            this.listado = listado;
        }

        public Panaderia getPanaderia() {
            return panaderia;
        }

        public void setPanaderia(Panaderia panaderia) {
            this.panaderia = panaderia;
        }

        public int getCantPedidos() {
            return cantPedidos;
        }

        public void setCantPedidos(int cantPedidos) {
            this.cantPedidos = cantPedidos;
        }

        public List<Equipo> getListadoEquipo() {
            return listadoEquipo;
        }

        public void adicionarEquipo(Equipo d){

            if (d.getCantidadEquipo()>10)
                listadoEquipo.add(0,d);
            else listadoEquipo.add(d);


        }

        public float promedioCantidad(){
            int suma=0;

            for (Equipo d:listadoEquipo
                    ) {
                suma+=d.getCantidadEquipo();

            }
            return suma/getListadoEquipo().size();
        }


        public void adicionarPedido(Pedido d) throws Exception {

            if (cantPedidos < listado.length) {

                if (d.isConFactura()) {
                    for (int i = cantPedidos; i > 0; i--) {
                        listado[i] = listado[i - 1];
                    }
                    listado[0] = d;
                } else
                    listado[cantPedidos] = d;
                cantPedidos++;

            } else
                throw new Exception("Imposible adicionar más Deportes");


        }
    }

