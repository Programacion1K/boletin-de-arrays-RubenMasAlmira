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
        for(int i=0;i<=longuitud-1;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posición "+i+ " del vector:"));
        }
        return array;
    }

    public static boolean capicua(int[] array){
        int principio=0;
        int ultimo=array.length-1;
        while (true){
            if(array[principio]!=array[ultimo]){
                return false;
            }
            principio++;
            ultimo--;
            if(principio>ultimo){
                return true;
            }
        }

    }
}
