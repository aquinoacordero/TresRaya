package tresraya;
/**
 *
 * @author Aitor
 */
import javax.swing.JOptionPane;

public class Menu {
    public int menu(){
    int seleccion = JOptionPane.showOptionDialog(
            null,"Seleccione una opcion", "Opciones", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
            null, new Object[]{"JUGAR","MARCADOR","SALIR"}, this);
            return seleccion;
            }
}
