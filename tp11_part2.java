import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Ejercicio 4
        /*ArrayList<Double> numeros = new ArrayList<Double>();
        double mayor=0;
        double menor = Double.MAX_VALUE;
        double numero;
        for (int i=0;i<20;i++){
            System.out.println("Ingrese un numero decimal: ");
            numero= sc.nextDouble();
            numeros.add(numero);
        }
        for(double iterador :numeros){
            if(iterador>mayor){
                mayor=iterador;
            }
            if(iterador<menor){
                menor=iterador;
            }
        }

        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero menor es: "+ menor);
        System.out.println("El rango de diferencia es: "+ Math.abs(mayor-menor));*/

        //Ejercicio 5
        /*ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        int num,suma,nums_iguals,mayores,menores;
        suma=nums_iguals=mayores=menores=0;

        for(int i = 0; i < 20; i++) {
            do {
                num = rand.nextInt(100) + 1;
            } while (num % 2 != 0);
            numeros.add(num);
            suma+=num;
        }
        double promedio_aritmetico=(double)suma/numeros.size();

        for(int iterador:numeros){
            if (iterador==promedio_aritmetico) {
                nums_iguals += 1;
            }
            if(iterador>promedio_aritmetico){
                mayores+=1;
            }
            if(iterador<promedio_aritmetico){
                menores+=1;
            }
        }
        System.out.println("El promedio aritmetico es: "+promedio_aritmetico);
        System.out.println("Los numeros iguales al promedio son: "+nums_iguals);
        System.out.println("Los numeros mayores al promedio son: "+mayores);
        System.out.println("Los numeros menores al promedio son: "+menores);*/




        }
    }
