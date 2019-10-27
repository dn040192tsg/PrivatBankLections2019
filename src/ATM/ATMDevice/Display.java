package ATM.ATMDevice;


import ATM.Interface.SwingInterface;

public class Display {

    String displayName = null;
    SwingInterface swingInterface = null;

    public Display(String displayName, SwingInterface swingInterface) {
        this.displayName = displayName;
        this.swingInterface = swingInterface;
    }

    public Display(String displayName) {
        this.displayName = displayName;
    }


    public void viewContent (String content){
        if (swingInterface!=null){
            swingInterface.viewDisplay(content);
        }else{
            System.out.println(content);
        }
    }

    public void viewSystemContent (String content){
        System.out.println("\u001B[32m" + content + "\u001B[0m");
    }


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


}
