import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo");
        int[] IP=convertirStringEnArrayDeInt("192.168.10.2");
        System.out.println(Arrays.toString(IP));

    }
    private static int[] convertirStringEnArrayDeInt(String IPASeparar){
        int[] IP=new int[4];

        /* int IPIntroducidas=0;
        int posicionDelUltimoPunto=0;
        int j=0;
       for(int i=0;i<IPASeparar.length()-1;i++){
                if(IPASeparar.charAt(i)=='.'){
                    IP[j]=Integer.parseInt(IPASeparar.substring(posicionDelUltimoPunto,i));
                    posicionDelUltimoPunto=i;
                    j++;
                }
        }*/
        return IP;
    }
}
