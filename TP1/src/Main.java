import java.util.*;

public class Main {
    Scanner dataEntry = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner dataEntry = new Scanner(System.in);
        Main m =  new Main();
        char control;
        do {
            System.out.println("Test de ejercicios a continuacion: ");
            System.out.println(">Ingrese 1 para ingresar numeros enteros y promediarlos.");
            System.out.println(">Ingrese 2 para obtener los primeros 100 numeros primos.");
            System.out.println(">Ingrese 3 para obtener codigo ASCII de un caracter.");

            int controlS = dataEntry.nextInt();
            switch(controlS) {
                case 1:
                    int[] arrayProm = new int[5];
                    int promedio = m.promArr(arrayProm);
                    System.out.println("El promedio de los numeros ingresados es: " + promedio);
                break;
                case 2:
                    int[] arrayPrimo = new int[100];
                    controlPrimo(arrayPrimo);
                break;
                case 3:
                    System.out.println("Ingrese un caracter: ");
                    char convertir = dataEntry.next().charAt(0);
                    valorChar(convertir);
                break;
                case 4:
                    ArrayList<Double> temperaturas = new ArrayList<>();
                break;
            }
            System.out.println(">Desea continuar? (s/n)");
            control = dataEntry.next().charAt(0);
        }while(control == 's' || control == 'S');
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
        System.out.println("Los primeros 100 numeros primos son: ");
        for(int i = 0; i < dim; i++){
            System.out.println(arr[i] + " " );
        }
    }

    public static void valorChar(char caracter){
        System.out.println("El numero ASCII del caracter seleccionado es: " + (int)caracter);
    }

    public static void agregar(ArrayList<Double> arrList){
        Scanner dataEntry = new Scanner(System.in);
        System.out.println(">Ingrese una temperatura en C°: ");
        Double tempAgregar = dataEntry.nextDouble();
        arrList.add(tempAgregar);
    }

}
