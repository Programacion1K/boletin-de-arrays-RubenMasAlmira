import javax.swing.*;

public class Ejercicio2Capicua {
    public static void main(String[] args) {
        int[] array=EArray(Integer.parseInt(JOptionPane.showInputDialog("Introduce la longuitud del vector a comprobar:")));
        if (capicua(array)==true){
            JOptionPane.showMessageDialog(null,"El vector introducido es capicua");
        }else{
            JOptionPane.showMessageDialog(null,"El vector introducido no es capicua");
        }
    }


    public static int[]EArray(int longuitud){
        int[] array=new int[longuitud];
        for(int i=0;i<=longuitud;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posición "+i+ " del vector:"));
        }
        return array;
    }

    public static boolean capicua(int[] array){
        boolean capicua=true;
        for(int n:array){
            if(){}
        }
        return capicua;
    }
}
