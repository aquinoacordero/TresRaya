package tresraya;

/**
 *
 * @author Aitor and Pacho
 */
public class TresRaya {

    public static void main(String[] args) {
        
        Menu objMenu = new Menu();
        FicheroMarcador objFich=new FicheroMarcador();
        int op = objMenu.menu();
        do {
            switch (op) {
                case 0:
                    System.out.println("juegas");
                    break;
                case 1:
                    System.out.println("Nombre"+"           "+"P.Ganadas"+"         "+"P.Perdidas");
                    objFich.LeerFichero("Marcador.txt");
                    break;
                case 2:
                    System.exit(op=2);
            }

        } while (op != 2);

    }

}
