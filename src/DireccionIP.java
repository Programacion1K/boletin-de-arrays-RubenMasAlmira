import java.util.Arrays;

public class DireccionIP {

    private static final int LONGITUD_DE_LA_IP = 4;
    private int[] IP = new int[LONGITUD_DE_LA_IP];

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

//Error,la IP no sale correctamente y el método de privada o publica no funciona como debería

    /*  - La clase (A, B, C) a la que pertenece la IP
        - Si es una Id de Red
        - La Id de Red de esa Dirección IP
        - La máscara de red.
        - Si es privada o pública  */
    public String infoIP(){
        String salida="";
        salida+="Dirección IP: "+IP.toString()+"\n";
        salida+="Id de Red: "+obtenerIdDeRed(IP).toString()+"\n";
        salida+="Máscara de Red :"+obtenerMascara(IP).toString()+"\n";
        salida+="¿Privada o Pública?: "+obtenerPrivadaOPublica(IP)+"\n";
        salida+="Clase: "+obtenerClase(IP)+"\n";
        salida+="¿Id de Red?: "+""+"\n";
        return salida;
    }




    public int[] getIP(){
        return IP;
    }

    @Override
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
        return '.';
    }
    //Método para obtener la Mascara de Red
    private DireccionIP obtenerMascara(int[] IP){
        switch (obtenerClase(IP)){
            case'A':
                int[] MascaraArrayClaseA={255,0,0,0};
                DireccionIP MascaraDeRedClaseA=new DireccionIP(MascaraArrayClaseA);
                return MascaraDeRedClaseA;
                break;
            case'B':
                int[] MascaraArrayClaseB={255,255,0,0};
                DireccionIP MascaraDeRedClaseB=new DireccionIP(MascaraArrayClaseB);
                return MascaraDeRedClaseB;

            case'C':
                int[] MascaraArrayClaseC={255,255,255,0};
                DireccionIP MascaraDeRedClaseC=new DireccionIP(MascaraArrayClaseC);
                return MascaraDeRedClaseC;

            default:
                int[] MascaraArray={0,0,0,0};
                DireccionIP MascaraDeRed=new DireccionIP(MascaraArray);
                return MascaraDeRed;
        }
    }


    //Método para obtener si la IP es privada o publica
    private String obtenerPrivadaOPublica(int[] IP){
        switch (obtenerClase(IP)){
            case'A'://10.0.0.0-10.255.255.255
                    if(IP[0]==10){
                    return "Privada";
                    }break;
            case'B'://172.16.0.0-172.31.255.255   //172.15.5.4
                    if(IP[0]==172 && IP[1]>16 && IP[1]<31){
                    return "Privada";
                    }break;
            case'C'://192.168.0.0-192.168.255.255
                    if(IP[0]==192 && IP[1]==168){
                    return "Privada";
                    }break;
            default:
                    return "error";
        }
        return "Pública";
    }

}