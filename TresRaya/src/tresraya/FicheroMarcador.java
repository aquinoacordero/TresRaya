package tresraya;

/**
 *
 * @author Aitor
 */
import java.io.*;
import java.util.Scanner;

public class FicheroMarcador {

    static Scanner fichR;
    PrintWriter fichW;

    public FicheroMarcador() {

    }

    public void LeerFichero(String fichero) {
        String res;
        try {
            fichR = new Scanner(new File(fichero));  
            while(fichR.hasNextLine()){
                res=fichR.nextLine();
                String [] marcador=res.split("-");
                System.out.println(marcador[0]+"              "+marcador[1]+"                 "+marcador[2]);
                
            }
        } catch (IOException excep) {
            System.err.println("erro"+excep.toString());
        }
    }

    public void EscribirFichero(String fichero) {
        try {

        } catch (Exception b) {

        }
    }
}
