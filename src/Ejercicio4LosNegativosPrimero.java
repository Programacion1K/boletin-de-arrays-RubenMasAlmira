import javax.swing.*;
import java.util.Arrays;

public class Ejercicio4LosNegativosPrimero {
    public static void main(String[] args) {
        int[] v=EArray(Integer.parseInt(JOptionPane.showInputDialog("Introduce la longuitud del vector")));
        int[] u=ponerLosNegativosDelante(v);
        System.out.println(SArray(v));
        System.out.println(SArray(u));
        }
        public static int[] ponerLosNegativosDelante(int[] vector){
            //copia del vector original para modificarlo
            int [] vectorConLosNegativosDelante=(int [])vector.clone();
            int numeroDeNegativosMovidos=0;
            for(int i=0;i<vectorConLosNegativosDelante.length;i++){
                if(vectorConLosNegativosDelante[i]<0){
                    int numeroGuardado=vectorConLosNegativosDelante[numeroDeNegativosMovidos];
                    vectorConLosNegativosDelante[numeroDeNegativosMovidos]=vectorConLosNegativosDelante[i];
                    vectorConLosNegativosDelante[i]=numeroGuardado;
                    numeroDeNegativosMovidos++;
                }
            }
            return vectorConLosNegativosDelante;
        }
        //Metodo de entrada de arrays
    public static int[] EArray(int longuitud){
        int[] array=new int[longuitud];
        for(int i=0;i<=longuitud-1;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posición "+i+": "));
        }
        return array;
    }
    //Metodo de salida de arrays
    public static String SArray(int[] array){
            return Arrays.toString(array);
    }
}
