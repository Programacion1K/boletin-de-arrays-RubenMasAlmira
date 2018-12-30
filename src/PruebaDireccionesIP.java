//Clase para comprobar que la clase DireccionIP funciona correctamente
public class PruebaDireccionesIP {
    public static void main(String[] args) {
       int[]IP={192,168,10,2};
       DireccionIP IPConArray=new DireccionIP(IP);
       DireccionIP IPConEnteros=new DireccionIP(192,168,10,2);
       DireccionIP IPConString= new DireccionIP("192.168.10.2");
        System.out.println(DireccionIP.infoIP(IPConArray));
        System.out.println(DireccionIP.infoIP(IPConEnteros));
        System.out.println(DireccionIP.infoIP(IPConString));
    }
}
