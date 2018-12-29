//Clase para comprobar que la clase DireccionIP funciona correctamente
public class PruebaDireccionesIP {
    public static void main(String[] args) {
       int[]IP={3,2,1,3};
       DireccionIP nuevaIP=new DireccionIP(IP);
       DireccionIP segundaIP=new DireccionIP(3,2,3,4);
        System.out.println(DireccionIP.infoIP(nuevaIP));
        System.out.println(DireccionIP.infoIP(segundaIP));
    }
}
