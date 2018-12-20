import javax.swing.*;
import java.util.Arrays;

/*      Construir un programa que pida al usuario dos vectores de números enteros v1 y v2,
        y que construya un nuevo vector del resultado de "concatenar" los vectores v1 y v2.
        Es decir, colocar los elementos de v2 a continuación de los de v1 y, finalmente,
        mostrar el resultado de la concatenación por pantalla.*/
public class Ejercicio1Concatenacion {
    public static void main(String[] args) {
        int longitud=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longuitud del primer array"));
        int[] v1=entradaArrays(longitud);
        longitud=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longuitud del segundo array"));
        int[] v2=entradaArrays(longitud);

        System.out.println("El array número 1 es: "+imprimirArrays(v1));
        System.out.println("El array número 2 es: "+imprimirArrays(v2));
        System.out.println("La concatenación de ambos arrays es: "+imprimirArrays(concatenar(v1, v2)));

    }

    public static int[] concatenar(int[] primerArray,int[] segundoArray){
        int[]arrayActual=(int[]) primerArray.clone();
        int[] concatenados=new int[primerArray.length+segundoArray.length];
        int contadorDeNumerosEnConcatenados=0;
        for(int i=0;i<arrayActual.length;i++){
            concatenados[contadorDeNumerosEnConcatenados]=arrayActual[i];
            contadorDeNumerosEnConcatenados++;
        }
        arrayActual=(int[]) segundoArray.clone();
        for(int i=0;i<arrayActual.length;i++){
            concatenados[contadorDeNumerosEnConcatenados]=arrayActual[i];
            contadorDeNumerosEnConcatenados++;
        }
        return concatenados;
    }







    //Tanto el método entradaArrays como el método salidaArrays deberían estar en otra clase
    //  y ser usados como metodos auxiliares para introducir arrays en todas las clases que lo necesiten
    // ,pero estan así para obligarme a practicarlos en los ejercicios.
    public static int[] entradaArrays(int longitud){
        int[] array=new int[longitud];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posición "+i+" del array"));
        }
        return array;
    }
    public static String imprimirArrays(int[] arrayParaImprimir){
        return Arrays.toString(arrayParaImprimir);
    }
}
