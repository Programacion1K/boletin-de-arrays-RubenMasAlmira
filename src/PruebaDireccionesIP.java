import javax.swing.*;

//Clase para comprobar que la clase DireccionIP funciona correctamente
public class PruebaDireccionesIP {
    public static void main(String[] args) {

        int[]IP={10,0,0,0};
       DireccionIP IPConArray=new DireccionIP(IP);
       //JOptionPane.showMessageDialog(null,IPConArray.infoIP());

       DireccionIP IPConString= new DireccionIP("226.13.5.4");
       //JOptionPane.showMessageDialog(null,IPConString.infoIP());

       DireccionIP IPConEnteros=new DireccionIP(192,168,0,0);
       //JOptionPane.showMessageDialog(null,IPConEnteros.infoIP());

        //System.out.println(DireccionIP.dosIpEnLaMismaRed(IPConArray, IPConEnteros));

        DireccionIP[] arrayDeIp={
                new DireccionIP(192,168,0,0),
                new DireccionIP(192,168,0,1),
                new DireccionIP(192,168,0,2),
                new DireccionIP(192,168,0,3),
                new DireccionIP(192,168,6,4),
        };
        System.out.println(DireccionIP.variasIpEnLaMismaRed(arrayDeIp));

    }
}
