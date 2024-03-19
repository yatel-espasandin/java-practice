import java.util.*;
import java.io.*;

public class Main {
    Scanner dataEntry = new Scanner(System.in);

    public static void main(String[] args) {
        Main m =  new Main();

        int[] arrayProm = new int[5];
        int promedio = m.promArr(arrayProm);
        System.out.printf("El promedio de los numeros ingresados es: " + promedio);

        int[] arrayPrimo = new int[100];
        controlPrimo(arrayPrimo);
    }

    public int promArr(int[] arr){
        int dim = arr.length;
        int temp;
        int suma = 0;

        for(int i = 0; i < dim; i++){
            System.out.println(">Ingrese un numero entero positivo");
            temp = dataEntry.nextInt();
                if(temp>0){
                    arr[i] = temp;
                    suma += arr[i];
                }else{
                System.out.println("El numero ingresado no es positivo.");
                }
        }
        return suma / dim;
    }

    public static void controlPrimo(int[] arr){
        int dim = arr.length;
        int i = 0;
        int j = 1;
        while(i < dim){
            if(esPrimo(j)){
                arr[i] = j;
                i++;
            }
            j++;
        }
        printArray(arr, dim);
    }

    public static boolean esPrimo(int i){
        if(i <= 1){
            return false;
        }
        for(int j = 2; j <= i/2; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr, int dim){
        System.out.printf("Los primeros 100 numeros primos son: ");
        for(int i = 0; i < dim; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
