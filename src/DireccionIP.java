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
    //todo hay que completar los constructores con los demas datos

    DireccionIP(int[]IP){
        this.IP=IP;

    }

    DireccionIP(int primerOcteto,int segundoOcteto,int tercerOcteto,int cuartoOcteto){
        IP[0]=primerOcteto;
        IP[1]=segundoOcteto;
        IP[2]=tercerOcteto;
        IP[3]=cuartoOcteto;
    }

    DireccionIP(String IPASeparar){
        System.out.println(IP = convertirStringEnArrayDeInt(IPASeparar));
    }
    //ERROR
    public static String infoIP(DireccionIP IP){
        return IP.getIP();
    }
    //ERROR
    public String getIP(){
        return Arrays.toString(IP);
    }

    //Metodo para convertir un String en un array de enteros
    private int[] convertirStringEnArrayDeInt(String IPASeparar){
        int[] IP=new int[LONGITUD_DE_LA_IP];
        int IPIntroducidas=0;
        int posicionDelUltimoPunto=0;
        for(int i=0;i<IPASeparar.length()-1;i++){
            for(int j=0;j<IP.length-1;j++){
                if(IPASeparar.charAt(i)=='.'){
                    IP[j]=Integer.parseInt(IPASeparar.substring(posicionDelUltimoPunto,i));
                    posicionDelUltimoPunto=i;
                }
            }
        }
        return IP;
    }
}
