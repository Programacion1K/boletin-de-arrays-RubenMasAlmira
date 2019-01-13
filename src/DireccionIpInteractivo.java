import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DireccionIpInteractivo {
    public static void main(String[] args) {
        String[]formasParaIntroducirIP={"Cadena Normal","Cuatro bytes","Salir"};
        Icon iconoIP=new ImageIcon(("C:\\Users\\Usuario\\IdeaProjects\\boletin-de-arrays-RubenMasAlmira\\src"));
        int opcionParaIntroducirIP= (int)JOptionPane.showOptionDialog(null,
                "Elija un método para introducir la IP",
                "Introducir IP",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.PLAIN_MESSAGE,
                iconoIP,
                formasParaIntroducirIP,null
                );
/*        switch (opcionParaIntroducirIP){
            case 0:
                String ipEnString=(String)JOptionPane.showInputDialog(null,
                        "Introduzca la IP separada por puntos",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE,
                        null,null,null);
                DireccionIP ipPorString=new DireccionIP(ipPorString);
                JOptionPane.showMessageDialog(null,
                        ipPorString.infoIP());
                break;
        }*/
    }
}
