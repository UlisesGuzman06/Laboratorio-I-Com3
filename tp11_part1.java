import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        /*ArrayList<String> marcas_autos =new ArrayList<>();
        String option=" ";
        String marca;
        while(!option.equals("2")){
            System.out.println("Desea ingresar la marca de un auto? 1)Si 2)No");
            option=sc.nextLine();
            if (option.equals("1")){
                System.out.println("Ingrese el nombre de la marca ");
                marca=sc.nextLine();
                marcas_autos.add(marca);
            } else if(option.equals("2")){
                System.out.println("Las marcas ingresadas son: ");
                System.out.println(marcas_autos);
            }else{
                System.out.println("Opcion Incorrecta");
            }
        }*/

        //Ejercicio 2
        /*EquipoDeFutbol team = new EquipoDeFutbol();
        String option = " ";
        while (!option.equals("4")) {
            System.out.println("Desea ingresar la marca de un auto? 1)Añadir Jugador 2)Borrar Jugador 3)Mostrar Plantilla 4)Salir");
            option = sc.nextLine();
            if (option.equals("1")) {
                team.Add_jugador();
            } else if (option.equals("2")) {
                team.Borrar_jugador();
            } else if (option.equals("3")) {
                team.Mostrar_plantilla();
            } else if (option.equals("4")) {
                System.out.println("Saliendo....");
            } else {
                System.out.println("Opcion Incorrecta");
            }
        }*/

        //Ejercicio 3
        /*Factura factura = new Factura(912, "2018-12-09", "Comeglio Santiago", 25.0, 4);

        factura.agregarArticulo("Articulo 1", 10.0, 3);
        factura.agregarArticulo("Articulo 2", 10.0, 1);

        System.out.println("Numero de Factura: " + factura.numero_factura);
        System.out.println("Fecha de Emision: " + factura.fecha_emision);
        System.out.println("Cliente: " + factura.cliente);

        System.out.println("Articulos:");
        for (String articulo : factura.articulos) {
            System.out.println("- " + articulo);
        }

        System.out.println("Subtotal: " + factura.subtotal);
        System.out.println("IVA: " + factura.iva);
        System.out.println("Total: " + factura.total);*/
    }


    public static class EquipoDeFutbol {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jugadores = new ArrayList<>();
        String jugador;

        public void Add_jugador() {
            System.out.println("Ingrese el nombre del jugador que quiere agregar");
            jugador = scanner.nextLine();
            jugadores.add(jugador);
            System.out.println("Jugador agregado correctamente");
        }

        public void Borrar_jugador() {
            System.out.println("Ingrese el nombre del jugador que quiere borrar");
            jugador = scanner.nextLine();
            if (jugadores.contains(jugador)) {
                jugadores.remove(jugador);
                System.out.println("Jugador eliminado correctamente.");
            } else {
                System.out.println("El jugador no existe en la plantilla.");
            }
        }

        public void Mostrar_plantilla() {
            System.out.println("La plantilla de jugadores es: ");
            for (String jugador : jugadores) {
                System.out.println(jugador);
            }
        }
    }

    public static class Factura {
        Integer numero_factura;
        String fecha_emision;
        String cliente;
        ArrayList<String> articulos;
        Double precio_unitario;
        Integer cantidad;
        Double subtotal;
        Double iva;
        Double total;

        public Factura(Integer numero_factura, String fecha_emision, String cliente,Double precio_unitario, Integer cantidad ) {
            this.numero_factura = numero_factura;
            this.fecha_emision = fecha_emision;
            this.cliente = cliente;
            this.articulos = new ArrayList<>();
            this.precio_unitario=precio_unitario;
            this.cantidad=cantidad;
            this.subtotal=0.0;
            this.iva=0.0;
            this.total=0.0;
        }
        public void agregarArticulo(String articulo, Double precio_unitario, Integer cantidad) {
            this.articulos.add(articulo);
            this.precio_unitario = precio_unitario;
            this.cantidad = cantidad;
            Subtotal();
            Calcular_iva();
            Total();
        }
        public void Subtotal(){
            subtotal=precio_unitario*cantidad;
        }
        public void Calcular_iva(){
            iva=subtotal*0.15;
        }
        public void Total(){
            total=subtotal+iva;
        }

    }
}

