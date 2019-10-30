package ATMDevice;
import Interface.SwingInterface;

/**
 * Class view content on display ATM
 */
public class Display {

    /**
     * Display name
     */
    String displayName = null;
    /**
     * Swing interface
     */
    SwingInterface swingInterface = null;

    /**
     * Constructor wihth swing interface initialization field
     * @param displayName
     * @param swingInterface
     */
    public Display(String displayName, SwingInterface swingInterface) {
        this.displayName = displayName;
        this.swingInterface = swingInterface;
    }

    /**
     * Comstructor
     * @param displayName display name
     */
    public Display(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Checks if there is any output interface available and prints data to the console
     * @param content String content
     */
    public void viewContent (String content){
        if (swingInterface!=null){
            swingInterface.viewDisplay(content);
        }else{
          //  System.out.println(content);
        }
    }

    /**
     * View system content in console
     * @param content String content
     */
    public void viewSystemContent (String content){
       // System.out.println("\u001B[32m" + content + "\u001B[0m");
    }

    /**
     * Standart getter
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Standart setter
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


}
