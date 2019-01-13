//Clase para solucionar errores con los metodos de la clase DireccionIP
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        DireccionIP IP=new DireccionIP("154.255.255.255");
        System.out.println(Arrays.toString(Prueba.devuelveIP(IP, 563)));

    }
    public static DireccionIP[] devuelveIP(DireccionIP ip,int numeroDeIpADevolver){

        switch (ip.obtenerClase(ip.getIP())) {
            case 'A':
                DireccionIP[] direccionesClaseA=new DireccionIP[numeroDeIpADevolver];
                int[] ipActualClaseA=ip.getIP().clone();
                for (int i = 0; i <numeroDeIpADevolver; i++) {
                    if (ipActualClaseA[3] > 255) {
                        if(ipActualClaseA[2]==255){
                            if(ipActualClaseA[1]==255){
                                ipActualClaseA[1]=0;
                            }else{
                                ipActualClaseA[1]++;
                            }
                            ipActualClaseA[2]=0;
                        }else{
                            ipActualClaseA[2]++;
                        }

                        ipActualClaseA[3] = 0;
                        direccionesClaseA[i] = new DireccionIP(ipActualClaseA[0], ipActualClaseA[1], ipActualClaseA[2], ipActualClaseA[3]);
                    } else {
                        direccionesClaseA[i] = new DireccionIP(ipActualClaseA[0], ipActualClaseA[1], ipActualClaseA[2], ipActualClaseA[3]++);
                    }
                }
                return direccionesClaseA;

            case 'B':
                DireccionIP[] direccionesClaseB=new DireccionIP[numeroDeIpADevolver];
                int[] ipActualClaseB=ip.getIP().clone();
                for (int i = 0; i <numeroDeIpADevolver; i++) {
                    if (ipActualClaseB[3] > 255) {
                        if(ipActualClaseB[2]==255){
                            ipActualClaseB[2]=0;
                        }else{
                            ipActualClaseB[2]++;
                        }

                        ipActualClaseB[3] = 0;
                        direccionesClaseB[i] = new DireccionIP(ipActualClaseB[0], ipActualClaseB[1], ipActualClaseB[2], ipActualClaseB[3]);
                    } else {
                        direccionesClaseB[i] = new DireccionIP(ipActualClaseB[0], ipActualClaseB[1], ipActualClaseB[2], ipActualClaseB[3]++);
                    }
                }
                return direccionesClaseB;
            case 'C':
                DireccionIP[] direccionesClaseC=new DireccionIP[numeroDeIpADevolver];
                int[] ipActualClaseC=ip.getIP().clone();
                for (int i = 0; i <numeroDeIpADevolver; i++) {
                    if (ipActualClaseC[3] > 255) {
                        ipActualClaseC[3] = 0;
                        direccionesClaseC[i] = new DireccionIP(ipActualClaseC[0], ipActualClaseC[1], ipActualClaseC[2], ipActualClaseC[3]);
                    } else {
                        direccionesClaseC[i] = new DireccionIP(ipActualClaseC[0], ipActualClaseC[1], ipActualClaseC[2], ipActualClaseC[3]++);
                    }
                }
                return direccionesClaseC;
            default:
                DireccionIP[] DireccionIPErroneaPorDefecto=new DireccionIP[0];
                return DireccionIPErroneaPorDefecto;
        }
    }
}
