package esempiogit;

/**
 *
 * @author Kamphe
 */
public class Programma {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var mySelfInstance = new Programma();
        mySelfInstance.putMessage("Hello GIT!");
    }

    /**
     * Stampa in output il messaggio dato come parametro
     * @param msg Messaggio da stampare in output
     */
    private void putMessage(String msg) {
        System.out.println(msg);
    }
}
