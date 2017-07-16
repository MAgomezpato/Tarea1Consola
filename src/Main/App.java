package Main;

import Class.Principal;
import Class.Pedido;
import Class.Equipo;
import Class.Panaderia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Principal principal = null;

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion=0;

        while (!salir) {

            System.out.println("1. Ingresar cantidad de PEDIDOS");
            System.out.println("2. Datos de la PANADERIA");
            System.out.println("3. Adicionar PEDIDOS");
            System.out.println("4. Listar PEDIDOS con FACTURA");
            System.out.println("5. Agregar tipo EQUIPO");
            System.out.println("6. Listar EQUIPO");
            System.out.println("7. Salir");


            System.out.println("Sistema para la Gestion de Panaderia y Equipos");

            try {
                System.out.println("Seleccione una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Cuantos PEDIDOS desea ingresar");
                        principal = new Principal(sn.nextInt());
                        break;
                    case 2:
                        System.out.println("Nombre PANADERIA:");
                        Panaderia panaderia = new Panaderia(sn.next());
                        panaderia.setNombrePanaderia(sn.next());
                        System.out.println("Direccion de PANADERIA:");
                        panaderia.setDireccionPanaderia(sn.next());
                        break;
                    case 3:
                        System.out.println("Tipo de PEDIDO:");
                        Pedido pedido = new Pedido(sn.next());
                        System.out.println("Con FACTURA? (S/N):");
                        if (sn.next().equalsIgnoreCase("S"))
                            pedido.setConFactura(true);
                        principal.adicionarPedido(pedido);

                        break;
                    case 4:
                        Pedido[] listado = principal.getListado();
                        for (int i = 0; i <principal.getCantPedidos() ; i++) {
                            if(listado[i].isConFactura())
                                System.out.printf("PEDIDO #"+(i+1)+ ": "+listado[i].getTipoPedido()+"\n");
                        }
                        System.out.println("--------------");
                        break;
                    case 5:
                        System.out.println("desea agregar EQUIPOS:");
                        System.out.println("Marque 0:");

                        Equipo datosEquipo = new Equipo(sn.next());

                        System.out.println("Tipo de EQUIPO:");
                        datosEquipo.setTipoEquipo(sn.next());
                        System.out.println("cantidad de EQUIPOS:");
                        datosEquipo.setCantidadEquipo(sn.nextInt());

                        principal.adicionarEquipo(datosEquipo);
                        break;
                    case 6:
                        Equipo[] list= principal.getListadoEquipo().toArray(new Equipo[0]);
                        for (int a = 0; a<10; a++){
                            System.out.println("El tipo de EQUIPO #"+(a+1)+" es: "+list[a].getTipoEquipo()+", "+" Se necesitan: "+list[a].getCantidadEquipo()+" EQUIPOS"+"\n");
                        }
                        break;
                    case 7:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }


}


