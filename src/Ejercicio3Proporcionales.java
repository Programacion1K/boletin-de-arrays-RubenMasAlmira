import javax.swing.*;

public class Ejercicio3Proporcionales {
    public static void main(String[] args) {
        int[] primerArray=EArray(Integer.parseInt(JOptionPane.showInputDialog("Introduce la longuitud del vector a comprobar:")));
        int[] segundoArray=EArray(Integer.parseInt(JOptionPane.showInputDialog("Introduce la longuitud del vector a comprobar:")));





    }
    //Metodo para introducir un array
    public static int[] EArray(int longuitud){
        int[] array=new int[longuitud];
        for(int i=0;i<=longuitud-1;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posición "+i+": "));
        }
        return array;
    }
}
