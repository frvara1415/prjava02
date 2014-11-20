package prjava02;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author ­­> francesc valenti raso frvara1415@gmail.com
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versió 0.1 del projecte prjava02");
        try {
            InetAddress adreça = InetAddress.getLocalHost();
            String ipAddr = adreça.getHostAddress();
            String hostname = adreça.getHostName();
            System.out.println("hostname=" + hostname);
            System.out.println("Adreça IP: " + ipAddr);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
            System.out.println("Creació d'una branca del projecte prjava02");
            System.out.println("Afegint més codi a la branca00 del projecte prjava02");
            System.out.println("Afegint codi a la branca01 del projecte prjava02");
        } catch (IOException e) {
        }
    }
}
