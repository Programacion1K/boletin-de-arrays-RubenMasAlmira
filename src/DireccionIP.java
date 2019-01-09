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
        salida+="Dirección IP: "+IP.toString()+"\n";
        salida+="Id de Red: "+obtenerIdDeRed(IP).toString()+"\n";
        salida+="Máscara de Red :"+obtenerMascara(IP).toString()+"\n";
        salida+="¿Es privada?: "+"\n";
        salida+="Clase: "+obtenerClase(IP)+"\n";
        salida+="¿Id de Red?: "+"\n";
        return salida;
    }




    public String getIP(){
        return Arrays.toString(IP);
    }

    public String toString(){
        String salida=IP[0]+"."+IP[1]+"."+IP[2]+"."+IP[3];
        return salida;
    }







    //Método para convertir un String en un array de enteros
    private int[] convertirStringEnArrayDeInt(String IPASeparar) {
        int[] IP = new int[LONGITUD_DE_LA_IP];
        for (int i = 0; i < IP.length-1; i++) {
            IP[i] = Integer.parseInt(IPASeparar.substring(0, IPASeparar.indexOf('.')));
            IPASeparar = IPASeparar.substring(IPASeparar.indexOf('.') + 1, IPASeparar.length());
            if (IPASeparar.indexOf('.') == -1) {
                IP[3] = Integer.parseInt(IPASeparar);
            }
        }
        return IP;
    }

    //Método para obtener la IdDeRed
    private DireccionIP obtenerIdDeRed(int[]IP){
        int[] IdDeRedArray = new int[LONGITUD_DE_LA_IP];
        IdDeRedArray=IP.clone();
        if(obtenerClase(IdDeRedArray)=='A'){
            IdDeRedArray[1]=0;
            IdDeRedArray[2]=0;
            IdDeRedArray[3]=0;
            DireccionIP IdDeRed=new DireccionIP(IdDeRedArray);
            return IdDeRed;
        }else if(obtenerClase(IdDeRedArray)=='B'){
            IdDeRedArray[2]=0;
            IdDeRedArray[3]=0;
            DireccionIP IdDeRed=new DireccionIP(IdDeRedArray);
            return IdDeRed;
        }else if(obtenerClase(IdDeRedArray)=='C'){
            IdDeRedArray[3]=0;
            DireccionIP IdDeRed=new DireccionIP(IdDeRedArray);
            return IdDeRed;
        }
        DireccionIP IdDeRed=new DireccionIP(IdDeRedArray);
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
    private DireccionIP obtenerMascara(int[] IP){
        if (obtenerClase(IP)=='A'){
            int[] MascaraArray={255,0,0,0};
            DireccionIP MascaraDeRed=new DireccionIP(MascaraArray);
            return MascaraDeRed;
        }
        if(obtenerClase(IP)=='B'){
            int[] MascaraArray={255,255,0,0};
            DireccionIP MascaraDeRed=new DireccionIP(MascaraArray);
            return MascaraDeRed;
        }
        if(obtenerClase(IP)=='C'){
            int[] MascaraArray={255,255,255,0};
            DireccionIP MascaraDeRed=new DireccionIP(MascaraArray);
            return MascaraDeRed;
        }
        int[] MascaraArray={0,0,0,0};
        DireccionIP MascaraDeRed=new DireccionIP(MascaraArray);
        return MascaraDeRed;
    }

    //Método para obtener

}