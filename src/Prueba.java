//Clase para solucionar errores con los metodos de la clase DireccionIP
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo");
        int[] IP=convertirStringEnArrayDeInt("192.168.10.2");
        //System.out.println(Arrays.toString(IP));

    }
    //Metodo para convertir un String en un array de enteros
    private static int[] convertirStringEnArrayDeInt(String IPASeparar){
        int[] IP=new int[4];
        for(int i=0;i<3;i++){
            IP[i]=Integer.parseInt(IPASeparar.substring(0,IPASeparar.indexOf('.')));
            IPASeparar=IPASeparar.substring(IPASeparar.indexOf('.')+1,IPASeparar.length());
            if(IPASeparar.indexOf('.')==-1){
                IP[3]=Integer.parseInt(IPASeparar);
            }
        }
        return IP;
    }
}
