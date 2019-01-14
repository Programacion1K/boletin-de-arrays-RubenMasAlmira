import javax.swing.*;
public class DireccionIpInteractivo {
    public static void main(String[] args) {
        boolean salida = false;
        do {
            //Pregunta inicial
            String[] formasParaIntroducirIP = {"Cadena Normal", "Cuatro bytes", "Salir"};
            Icon iconoIP = new ImageIcon(("iconop.png"));
            int opcionParaIntroducirIP = (int) JOptionPane.showOptionDialog(null,
                    "Elija un método para introducir la IP",
                    "Introducir IP",
                    JOptionPane.PLAIN_MESSAGE,
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("./src/iconoIp.png"),
                    formasParaIntroducirIP, null
            );
            //Elección según la respuesta dada en la pregunta inicial
            switch (opcionParaIntroducirIP) {
                case 0:
                    try {
                        String ipEnString = (String) JOptionPane.showInputDialog(null,
                                "Introduzca la IP separada por puntos",
                                "Entrada",
                                JOptionPane.QUESTION_MESSAGE);
                        DireccionIP ipPorString = new DireccionIP(ipEnString);
                        JOptionPane.showMessageDialog(null,
                                ipPorString.infoIP(),
                                "INFORMACIÓN DE LA IP",
                                JOptionPane.PLAIN_MESSAGE,
                                new ImageIcon("./src/iconoIp.png"));
                        break;
                    }catch (java.lang.StringIndexOutOfBoundsException byteActual){
                        JOptionPane.showMessageDialog(null,"Introducción no valida","Error",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    catch(java.lang.NullPointerException byteActual){
                        JOptionPane.showMessageDialog(null,"Introducción no valida","Error",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                case 1:
                    int[] cuatroBytes = new int[4];

                        try {
                            for (int i = 0; i < 4; i++) {
                                int byteActual = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Introduzca el byte:" + i,
                                        "Entrada",
                                        JOptionPane.QUESTION_MESSAGE));

                                cuatroBytes[i] = byteActual;
                            }
                            DireccionIP ipEnCuatroBytes = new DireccionIP(cuatroBytes);
                            JOptionPane.showMessageDialog(null,
                                    ipEnCuatroBytes.infoIP(),
                                    "INFORMACIÓN DE LA IP",
                                    JOptionPane.PLAIN_MESSAGE,
                                    new ImageIcon("./src/iconoIp.png"));
                        }catch (java.lang.NumberFormatException byteActual){
                            JOptionPane.showMessageDialog(null,"Introducción no valida","Error",JOptionPane.ERROR_MESSAGE);
                            break;
                        }


                    break;
                default:
                    String[] opcionesDeSalida = {"Sí", "No"};
                    int salir = (int) JOptionPane.showOptionDialog(null,
                            "¿Esta seguro de que quiere salir?",
                            "Salida",
                            JOptionPane.PLAIN_MESSAGE,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcionesDeSalida,
                            null);
                    if(salir==0){
                        salida=true;
                    }

            }
        }while(salida!=true);
    }
}
