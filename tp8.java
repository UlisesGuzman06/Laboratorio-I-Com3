import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        //Ejercicio 1
        /*int numRows, numColumns;
        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];
        int [][] matrixTwo = new int[numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
                matrixTwo[i][j] = rm.nextInt(100);
            }
        }
        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz 2 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
        matrixAdder(matrixOne, matrixTwo);*/

        //Ejercicio 2
        /*int numRows, numColumns;
        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();
        int [][] matrixOne = new int [numRows][numColumns];
        int [][] matrixTwo = new int[numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(10);
                matrixTwo[i][j] = rm.nextInt(10);
            }
        }
        int [][] matrixThree = matrixMultiplier(matrixOne, matrixTwo);

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz 2 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz multiplicada es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }*/

        //Ejercicio 3
        /*int numRows, numColumns;
        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
            }
        }
        System.out.println("La matriz original es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        int [][] matrixTwo = transposedMatrix(matrixOne);

        System.out.println("La matriz transpuesta es: ");
        for(int i = 0; i < matrixTwo.length; i++){
            for (int j = 0; j < matrixTwo[0].length; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }*/

        //Ejerecicio 4
        /*int numRows, numColumns;
        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("Ingrese el valor de la posición [" + (i+1)+"]["+(j+1)+"]: ");
                matrixOne[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matriz original es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        boolean symetricMatrix = symmetricMatrix(matrixOne);
        if(symetricMatrix == true){
            System.out.print("La matriz es transpuesta");
        }else{
            System.out.print("La matriz no es transpuesta");
        }*/

        //Ejercicio 5
        /*int numAarry;
        float num;
        System.out.print("Ingrese el número de elementos del vector: ");
        numAarry = sc.nextInt();

        float array[] = new float[numAarry];
        for(int i = 0; i < numAarry; i++){
            array[i] = Math.round((rm.nextFloat() * 100) * 100.0f) / 100.0f;
        }
        System.out.print("Ingrese el número a multiplicar: ");
        num = sc.nextFloat();
        System.out.println("El vector original es: ");
        for(int i = 0; i < numAarry; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("El vector multiplicado escalarmente es: ");
        for(int i = 0; i < numAarry; i++){
            System.out.print((array[i]*num) + " ");
        }*/

        //Ejercicio 6
        /*int array6 [][] = new int[3][3];
        for(int j = 0; j< array6.length;j++){
            for(int l = 0; l< array6.length;l++){
                array6[j][l] = (int)(Math.random()*10);
                while (array6[j][l] ==0){
                    array6[j][l] = (int)(Math.random()*10);
                }
            }
        }
        for(int j = 0; j< array6.length;j++){
            for(int l = 0; l< array6.length;l++){
                System.out.print(array6[j][l]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("La suma de los elementos de la matriz es: "+sumarMatriz(array6));*/

        //Ejercicio 7
        /*int [] [] matriz = new int [3] [3];
        for (int l = 0; l<matriz.length; l ++){
            for(int j = 0 ; j<matriz.length; j++){
                matriz[l][j] = (int)(Math.random()*100);
            }
        }
        for(int l = 0; l< matriz.length;l++){
            for(int j = 0; j< matriz.length;j++){
                System.out.print(matriz[l][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println( mayorNumero(matriz));*/

        //Ejercicio 8
        /*int fil = 0,matriz [] [] = new int[3][3];
        for (int l = 0; l<matriz.length; l ++){
            for(int j = 0 ; j<matriz.length; j++){
                matriz[l][j] = (int)(Math.random()*100);
                while(matriz[l][j] == 0){
                    matriz[l][j] = (int)(Math.random()*100);
                }
            }
        }
        for(int l = 0; l< matriz.length;l++){
            for(int j = 0; j< matriz.length;j++){
                System.out.print(matriz[l][j]+ " ");

            }
            System.out.println( " ");
        }
        System.out.println("Que fila desea sumar: ");
        fil = sc.nextInt();
        while(fil>matriz.length || fil <0){
            System.out.println("La matriz posee "+ matriz.length+ " filas, ingrese un número valido: ");
            fil = sc.nextInt();
        }
        System.out.println(sumaFila(matriz,fil));*/

        //Ejercicio 9
        /*int matriz[] []= new int[3][3], n = 0;
        for(int l = 0; l< matriz.length;l++){
            for(int j = 0; j< matriz.length;j++){
                matriz[l][j] = 0;
                if(l == n && j == n){
                    matriz[l][j] = (int)(Math.random()*100);
                }else {
                    matriz[l][j] = 0;
                }
            }
            n++;
            System.out.println( " ");
        }
        for(int l = 0; l< matriz.length;l++){
            for(int j = 0; j< matriz.length;j++){
                System.out.print(matriz[l][j]+ " ");

            }
            System.out.println(" ");
        }
        System.out.println(diagonalNot(matriz));*/

        //Ejercicio 10
        /*int tamanio;
        System.out.println("Ingrese el tamaño de la matriz: ");
        tamanio = sc.nextInt();
        matrizIdentidad(tamanio);*/

        //Ejercicio 11
        /*Integer[][] matriz_numeros = new Integer[3][3];
        System.out.println("Ingrese numeros para llenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_numeros[i][j]=sc.nextInt();
            }
        }
        parImpar(matriz_numeros);*/

        //Ejercicio 12
        /*Integer [][] matriz = new Integer [3][3];
        System.out.println("Ingrese numeros para llenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matriz Original ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        rotarMatriz(matriz);*/

        //Ejercicio 13
        /*String [][] matriz = new String[3][3];
        String elemento ;

        System.out.println("Ingrese valores para llenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=sc.nextLine();
            }
        }
        System.out.println("Ingrese elemento que quiere buscar en la matriz: ");
        elemento=sc.nextLine();
        bucarElemento(matriz,elemento);*/

        //Ejercicio 14
        /*Integer [][] matriz = new Integer [3][3];
        System.out.println("Ingrese numeros para llenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matriz Original ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        invertirFilas(matriz);*/

        //Ejercicio 15
        /*Integer [][] matriz = new Integer [4][4];
        System.out.println("Ingrese numeros para llenar la matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matriz");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sumaDiagonales(matriz);*/

        //Ejercicio 16
        /*int matrix[][] = {
                {1,6,0},
                {6,-3,8},
                {0,8,4}
        };
        System.out.println(matrizOctogonal(matrix));*/

        //Ejercicio 17
        /*int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();
        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
            }
        }
        System.out.println("La matriz es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        minValueRow(matrixOne);*/

        //Ejercicio 18
        /*int numRows, numColumns;

        System.out.print("Ingrese el número de filas de la matriz 1: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz 1: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(10);
            }
        }

        System.out.print("Ingrese el número de filas de la matriz 2: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz 2: ");
        numColumns = sc.nextInt();

        int [][] matrixTwo = new int[numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixTwo[i][j] = rm.nextInt(10);
            }
        }

        int [][] matrixThree = matrixMultiplier(matrixOne, matrixTwo);

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < matrixOne.length; i++){
            for (int j = 0; j < matrixOne[0].length; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz 2 es: ");
        for(int i = 0; i < matrixTwo.length; i++){
            for (int j = 0; j < matrixTwo[0].length; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz multiplicada es: ");
        for(int i = 0; i < matrixThree.length; i++){
            for (int j = 0; j < matrixThree[0].length; j++){
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }*/
    }
    public static void matrizIdentidad(int t){
        Integer[][] matriz = new Integer[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (matriz[i] == matriz[j]) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
    public static void parImpar(Integer [][] matriz){
        int pares,impares;
        pares=impares=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]%2==0){
                    pares+=1;
                }else{
                    impares+=1;
                }
            }
        }
        System.out.println("Matriz ingresada");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("La cantidad de elemntos pares en la matriz es de: "+pares);
        System.out.println("La cantidad de elemntos impares en la matriz es de: "+impares);
    }
    public static void bucarElemento(String [] [] matriz, String element){
        int contador;
        contador=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j].equals(element)){
                    contador+=1;
                }
            }
        }
        if(contador>0){
            System.out.println("El elemento "+element+" se encontro "+ contador +" vez/veces");
        }else{
            System.out.println("El elemento "+ element +" no se encontro en la matriz ");
        }

    }
    public static void rotarMatriz(Integer [] [] matriz){
        Integer [] [] matriz_transpuesta= new Integer [3][3];
        Integer [] [] matriz_rotada= new Integer [3][3];
        int filas = matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz_transpuesta[i][j]=matriz[j][i];
            }
        }

        for(int i = 0; i < matriz_rotada.length; i++) {
            for (int j = 0; j < matriz_rotada[i].length; j++) {
                matriz_rotada[i][j] = matriz_transpuesta[i][filas-1-j];
            }
        }
        System.out.println("Matriz Rotada");
        for(int i = 0; i < matriz_rotada.length; i++) {
            for (int j = 0; j < matriz_rotada[i].length; j++) {
                System.out.print(matriz_rotada[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void matrixAdder(int [] [] matrixOne, int [] [] matrixTwo){
        int rows = matrixOne.length;
        int cols = matrixOne[0].length;

        int [][] matrixAux = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrixAux[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        System.out.println("La suma de las 2 matrices es: ");
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrixAux[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixMultiplier(int [] [] matrixOne, int [] []matrixTwo){
        int i = 0, j = 0,k = 0, f = 0, counter = 0;
        int rows = matrixOne.length;
        int cols = matrixOne[0].length;
        int [][] matrixAux = new int[rows][cols];

        while (matrixAux[matrixOne.length-1][matrixOne[0].length-1] == 0){
            while (j < rows && i < cols){
                counter += matrixOne[k][j] * matrixTwo[i][f];

                i += 1;
                j += 1;
            }
            matrixAux[k][f] = counter;
            counter = 0;
            i = 0;
            j = 0;

            f++;
            if(f == cols){
                f = 0;
                k++;
            }
            if(k == rows){
                break;
            }
        }
        return matrixAux;
    }
    public static int[][] transposedMatrix(int [] [] matrixOne){
        int [][] matrixAux = new int [matrixOne[0].length][matrixOne.length];
        for (int i = 0; i < matrixAux.length; i++){
            for (int j = 0; j < matrixAux[0].length; j++){
                matrixAux[i][j] = matrixOne[j][i];
            }
        }
        return matrixAux;
    }
    public static boolean symmetricMatrix(int [] []matrixOne){
        int [][] matrixAux = transposedMatrix(matrixOne);
        for (int i = 0; i < matrixAux.length; i++){
            for (int j = 0; j < matrixAux[0].length; j++){
                if(matrixAux[i][j] != matrixOne[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int sumarMatriz( int [] []matriz){
        int sum = 0,total = 0;

        for(int i = 0; i != matriz.length; i++){
            for(int j = 0; j != matriz.length;j++){
                sum +=matriz[i][j];
            }
            total += sum;
            sum = 0;
        }
        return total;
    }
    public static String mayorNumero(int [] [] matriz){
        int mayor = 0;
        String posicion = " ";
        for(int i = 0;i < matriz.length; i++){
            for (int j = 0; j< matriz.length;j++){
                if(matriz[i][j]>mayor){
                    mayor = matriz[i][j];
                    posicion = "El mayor número es: "+ mayor + " y está en la fila " + (i+1) + " y en la columna " + (j+1);
                }

            }
        }
        return posicion;
    }
    public  static String sumaFila(int [] [] matriz,int fil){
        int i = 0;
        int total = 0;
        fil = fil-1;
        while (i<matriz.length){
            total += matriz[fil][i];
            i++;
        }
        return "El total es: " + total;
    }
    public static String diagonalNot(int [] [] matriz){
        int n = 0;
        int contador_num = 0,  contador_verdad = 0;
        for (int i = 0; i<matriz.length;i++){
            for(int j = 0; j<matriz.length;j++){
                if(j==n && i == n && matriz[i][j] != 0){
                    contador_num+=1;
                } else if (matriz[i][j] != 0) {
                    contador_num +=1;
                }
            }
            if(contador_num == 1 ){
                contador_verdad+=1;
            }
            contador_num = 0;
            n++;
        }
        if(contador_verdad==(matriz.length)){
            return"La matriz está en forma diagonal";
        }else { return "La matriz no está en forma diagonal";}
    }
    public static void invertirFilas (Integer[][] matriz){
        int filas = matriz.length;
        for (int i = 0; i < filas / 2; i++) {
            Integer[] temp = matriz[i];
            matriz[i] = matriz[filas - 1 - i];
            matriz[filas - 1 - i] = temp;
        }
        System.out.println("Matriz con Filas Ivertidas ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumaDiagonales (Integer[][] matriz){
        int sumaDiagonal1=0;
        int sumaDiagonal2=0;
        int suma=0;
        for(int i=0;i<matriz.length;i++){
            sumaDiagonal1+=matriz[i][i];
            sumaDiagonal2+=matriz[i][matriz.length-1-i];
        }
        suma=sumaDiagonal1+sumaDiagonal2;
        System.out.println("La suma de las diagonales de la matriz es: "+ suma);
    }
    public static String matrizOctogonal(int matriz[][]) {
        int n = 0, matriz_transpuesta[][] = new int [matriz.length][matriz.length];

        if (matriz[0].length == matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz_transpuesta[j][i] = matriz[i][j];
                }
            }

            System.out.println("La matriz es: ");
            for (int i = 0;i< matriz.length;i++){
                for(int j = 0; j< matriz.length;j++){
                    System.out.print(matriz_transpuesta[i][j] + " ");
                    if (matriz_transpuesta[i][j] == matriz[i][j]){
                        n+=1;
                    }
                }
                System.out.println(" ");
            }
        } else{
            return "La matriz ingresada no es cuadrada";
        }
        if (n == (matriz.length*matriz.length)){
            return "La matriz es ortogonal";
        }else {
            return "La matriz no es ortogonal";
        }
    }
    public static void minValueRow(int [][] matrixOne){

        int [] arryAux = new int [matrixOne.length];
        int valueRow =Integer.MAX_VALUE;

        for(int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                if(matrixOne[i][j] < valueRow){
                    valueRow = matrixOne[i][j];
                }
            }
            arryAux[i] = valueRow;
            valueRow =Integer.MAX_VALUE;
        }

        System.out.println("Los minimos valores de cada fila son: ");
        for (int i=0; i < matrixOne.length; i++){
            System.out.print(arryAux[i] + " ");
        }
    }
}
