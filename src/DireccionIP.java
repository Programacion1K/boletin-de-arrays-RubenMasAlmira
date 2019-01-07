import java.util.Arrays;

public class DireccionIP {

    /*  - La clase (A, B, C) a la que pertenece la IP
        - Si es una Id de Red
        - La Id de Red de esa Dirección IP
        - La máscara de red.
        - Si es privada o pública  */
    private static final int LONGITUD_DE_LA_IP = 4;
    private  int[] IP = new int[LONGITUD_DE_LA_IP];

    DireccionIP(int[] IP) {
        this.IP = IP;


    }

    DireccionIP(int primerOcteto, int segundoOcteto, int tercerOcteto, int cuartoOcteto) {
        this.IP[0] = primerOcteto;
        this.IP[1] = segundoOcteto;
        this.IP[2] = tercerOcteto;
        this.IP[3] = cuartoOcteto;

    }

    DireccionIP(String IPASeparar) {
        this.IP = convertirStringEnArrayDeInt(IPASeparar);

    }

//Error,los métodos de Obtener no salen como deberían
    public String infoIP(){
        String salida="";
        salida+="Dirección IP: "+getIP()+"\n";
        salida+="Id de Red: "+Arrays.toString(obtenerIdDeRed(IP))+"\n";
        salida+="Máscara de Red "+Arrays.toString(obtenerMascara(IP))+"\n";
        salida+="¿Es privada?: "+"\n";
        salida+="Clase: "+obtenerClase(IP)+"\n";
        salida+="¿Id de Red?: "+"\n";
        return salida;
    }




    public String getIP(){
        return Arrays.toString(IP);
    }
    @Override
    public String toString(){
        return "IP:"+getIP();
    }







    //Método para convertir un String en un array de enteros
    private int[] convertirStringEnArrayDeInt(String IPASeparar) {
        int[] IP = new int[LONGITUD_DE_LA_IP];
        for (int i = 0; i < 3; i++) {
            IP[i] = Integer.parseInt(IPASeparar.substring(0, IPASeparar.indexOf('.')));
            IPASeparar = IPASeparar.substring(IPASeparar.indexOf('.') + 1, IPASeparar.length());
            if (IPASeparar.indexOf('.') == -1) {
                IP[3] = Integer.parseInt(IPASeparar);
            }
        }
        return IP;
    }

    //Método para obtener la IdDeRed
    private int[] obtenerIdDeRed(int[]IP){
        int[] IdDeRed = new int[LONGITUD_DE_LA_IP];
        IdDeRed=IP.clone();
        IdDeRed[1]=0;
        IdDeRed[2]=0;
        IdDeRed[3]=0;
        return IdDeRed;
    }

    //Método para obtener la clase
    private char obtenerClase(int[]IP){
        char clase;
        if(IP[0]>=0 && IP[0]<=127){
            return 'A';
        }else if(IP[0]>=128 && IP[0]<=191){
            return 'B';
        }else if(IP[0]>=192 && IP[0]<=223){
            return 'C';
        }
        return 'N';
    }
    //Método para obtener la Mascara de Red
    private int[] obtenerMascara(int[] IP){
        if (obtenerClase(IP)=='A'){
            int[] Mascara={255,0,0,0};
            return Mascara;
        }
        if(obtenerClase(IP)=='B'){
            int[] Mascara={255,255,0,0};
            return Mascara;
        }
        if(obtenerClase(IP)=='C'){
            int[] Mascara={255,255,255,0};
            return Mascara;
        }
        int[] Mascara={0,0,0,0};
        return Mascara;
    }

    //Método para obtener

}