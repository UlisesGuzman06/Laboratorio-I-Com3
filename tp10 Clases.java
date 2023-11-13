import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Clase Perro: punto 1,2 y 3
        //Intancia para mostrar los datos
        /*Perro miPerro = new Perro();
        System.out.println("La raza del perro es: "+miPerro.raza);
        System.out.println("El nombre del perro es: "+miPerro.nombre);
        System.out.println("La edad del perro es: "+miPerro.edad);
        Perro.ladrar();*/

        //Clase Circulo: punto 4 y 5
        /*Circulo miCirculo = new Circulo(6.3);
        System.out.println("Area del circulo: " +miCirculo.calcularArea());
        System.out.println("Cincurferencia del circulo: " +miCirculo.calcularCircunferencia());*/

        //Clase Estudiante: punto 6 y 7
        /*Estudiante miEstudiante=new Estudiante("Santiago", 18,912);
        System.out.println("El nombre del estudiante es: "+miEstudiante.nombre);
        System.out.println("La edad del estudiante es: "+miEstudiante.edad);
        System.out.println("El numero de identificacion del estudiante es: "+miEstudiante.numero_identificacion);*/

        //Clase Libro: punto 8 y 9
        /*Libro miLibro=new Libro("Harry Potter","J. K. Rowling",2010);
        miLibro.infoLibro();*/

        //Clase CuentaBancaria: punto 10 y 11
        /*CuentaBancaria miCuentaBancaria=new CuentaBancaria();
        double retiro;
        double deposito;
        String op="0";
        while(!op.equals("3")) {
            System.out.println("Que operacion desea realizar? 1)Deposito 2)Retiro 3)Salir");
            op=sc.nextLine();
            if(op.equals("1")){
                System.out.println("Ingrese el monto que quiere depositar ");
                deposito=sc.nextDouble();
                miCuentaBancaria.Depositar(deposito);
            } else if(op.equals("2")){
                System.out.println("Ingrese el monto que quiere retirar ");
                retiro=sc.nextDouble();
                miCuentaBancaria.Retirar(retiro);
            }else if(op.equals("3")){
                 System.out.println("Saliendo...");
                 break;
             }else{
                System.out.println("Opcion Incorrecta");
                break;
            }
            sc.nextLine();
        }*/

        //Clase Recatangulo: punto 12
        /*Rectangulo miRectangulo=new Rectangulo(12,6);
        System.out.println("Area del Rectangulo: " +miRectangulo.calcularArea());
        System.out.println("Perimetro del Rectangulo: " +miRectangulo.calcularPerimetro());*/

        //Clase Coche: punto 13 y 14
        /*Coche miCoche = new Coche();
        miCoche.mostrarInformacion();
        miCoche.Acelerar(50);
        miCoche.mostrarVelocidad();
        miCoche.Frenar(50);
        miCoche.mostrarVelocidad();*/

        //Clase Pelicula:punto 15
        /*Pelicula miPelicula=new Pelicula("Cars 1","John Lasseter",116);
        miPelicula.MostrarDatos();*/
    }
    public static class Perro{
        //Punto 1
        String raza;
        String nombre;
        Integer edad;

        public Perro(){
            //Punto 2
            raza="Golden Retriever";
            nombre="Taco";
            edad=6;
        }
        public static void ladrar() {
            System.out.println("Guau, guau");
        }
    }
    public static class Circulo{
        //Punto 4 y 5
        Double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        public double calcularCircunferencia() {
            return 2 * Math.PI * radio;
        }

    }
    public static class Estudiante{

        String nombre;
        Integer edad;
        Integer numero_identificacion;
        // Constructor para inicializar los atributos
        public Estudiante(String nombre, int edad, Integer numero_identificacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.numero_identificacion = numero_identificacion;
        }

    }
    public static class Libro{
        String titulo;
        String autor;
        Integer anio_publicacion;

        public Libro(String titulo, String autor,Integer anio_publicacion){
            this.titulo=titulo;
            this.autor=autor;
            this.anio_publicacion=anio_publicacion;
        }

        public void infoLibro(){
            System.out.println("Titulo: "+ titulo);
            System.out.println("Autor: "+ autor);
            System.out.println("Año de publicacion: "+ anio_publicacion);
        }
    }
    public static class CuentaBancaria{
        double saldo;
        Integer numero_cuenta;

        public CuentaBancaria(){
            saldo=500;
            numero_cuenta=912;
        }
        public void Depositar(double deposito){
            if(deposito>0){
                System.out.println("Operacion Finalizada se deposito el monto ingresado");
                saldo+=deposito;
            }else{
                System.out.println("El monto a depositar debe ser mayor a 0.Reintentelo");
            }
        }
        public void Retirar(double retiro){
            if(retiro>0 && retiro<=saldo){
                saldo-=retiro;
                System.out.println("Operacion exitosa.Saldo restante: "+ saldo);
            }else if(retiro<=0){
                System.out.println("El retiro debe ser mayor a 0");
            }else{
                System.out.println("Fondos insuficientes");
            }
        }
    }
    public static class Rectangulo{
        double ancho;
        double alto;
        public Rectangulo(double ancho,double alto){
            this.ancho = ancho;
            this.alto = alto;

        }
        public double calcularArea(){
            return ancho * alto;
        }
        public double calcularPerimetro(){
            return 2 * (ancho + alto);
        }
    }
    public static class Coche{
        String marca;
        String modelo;
        Integer anio_fabricacion;
        Integer velocidad;
        public Coche(){
            marca="Lamborghini";
            modelo="Aventador";
            anio_fabricacion=2021;
            velocidad = 0;
        }
        public void Acelerar(Integer velocidad_aumento){
            velocidad += velocidad_aumento;
        }
        public void Frenar(Integer velocidad_disminucion){
            if (velocidad - velocidad_disminucion >= 0) {
                velocidad -= velocidad_disminucion;
            } else {
                velocidad = 0;
            }
        }
        public void mostrarInformacion() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año de fabricacion: " + anio_fabricacion);
        }
        public void mostrarVelocidad(){
            System.out.println("Velocidad actual: " + velocidad + " km/h");
        }
    }
    public static class Pelicula{
        String titulo;
        String director;
        Integer minutos_duracion;
        public Pelicula(String titulo, String director,Integer minutos_duracion){
            this.titulo=titulo;
            this.director=director;
            this.minutos_duracion=minutos_duracion;
        }
        public void MostrarDatos(){
            System.out.println("El titulo de la pelicula es: "+ titulo);
            System.out.println("El director de la pelicula es: "+ director);
            System.out.println("Los minutos de duracion de la pelicula son: "+ minutos_duracion);
        }
    }
}