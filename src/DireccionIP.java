import java.util.Arrays;

public class DireccionIP {

/*  - La clase (A, B, C) a la que pertenece la IP
    - Si es una Id de Red
    - La Id de Red de esa Dirección IP
    - La máscara de red.
    - Si es privada o pública  */
    private static final int LONGITUD_DE_LA_IP=4;
    private int[]IP=new int[LONGITUD_DE_LA_IP];
    private char clase;
    private String red;
    private int[] IPDeRed;
    private int[] MascaraDeRed;
    private String PrivadaPublica;
    //todo hay que completar los constructores con los demas datos a partir de los metodos

    DireccionIP(int[]IP){
        this.IP=IP;

    }
//ERROR
    DireccionIP(int primerOcteto,int segundoOcteto,int tercerOcteto,int cuartoOcteto){
        primerOcteto=IP[0];
        segundoOcteto=IP[1];
        tercerOcteto=IP[2];
        cuartoOcteto=IP[3];
    }
//ERROR
    public static String infoIP(DireccionIP IP){
        return IP.getIP();
    }
//ERROR
    public String getIP(){
        return Arrays.toString(IP);
    }
}
