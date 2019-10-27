package ATM.Interface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingInterface extends JFrame {

    private JPanel buttons = null;
    private JPanel display = null;
    private JPanel ATM = null;
    private JTextArea jTextArea;
    private String readBuffer;


    public SwingInterface() throws HeadlessException {
        super("ATM");
        setBounds(100, 100, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createButton();
        createNextArea();
        createATM();

        setVisible(true);
        setSize(600, 600);

    }

    private void createATM() {
        ATM = new JPanel();
        ATM.setLayout(new GridLayout(2, 1, 5, 10));
        ATM.add(display);
        ATM.add(buttons);
        setContentPane(ATM);

    }

    private void createNextArea() {
        display = new JPanel();
        jTextArea = new JTextArea("", 20, 30);
        jTextArea.setLineWrap(true);
        display.add(jTextArea);
    }


    private void createButton() {

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 3, 5, 10));
        ButtonEventLisstener buttonEventLisstener = new ButtonEventLisstener();

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton("" + i);
            button.addActionListener(buttonEventLisstener);
            buttons.add(button);
        }
        JButton buttonReturn = new JButton("Return");
        buttonReturn.addActionListener(buttonEventLisstener);
        buttons.add(buttonReturn);


        JButton button0 = new JButton("0");
        button0.addActionListener(buttonEventLisstener);
        buttons.add(button0);

        JButton buttonCorrect = new JButton("Enter");
        buttonCorrect.addActionListener(buttonEventLisstener);
        buttons.add(buttonCorrect);
    }

    public void viewDisplay(String content) {
        jTextArea.setText("");
        jTextArea.setText(content);
    }

//    public void outputText() {
//        jTextArea.setText(content);
//    }

    public String getReadBuffer() {
        String request = readBuffer;
        readBuffer = null;
        return request;
    }

    private void setReadBuffer(String readBuffer) {
        this.readBuffer = readBuffer;
    }


    class ButtonEventLisstener implements ActionListener {
        String pushButtotn = "";

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (e.getActionCommand()) {
                case "Enter":
                    setReadBuffer(pushButtotn);
                    pushButtotn = "";
                    break;
                case "Return":
                    setReadBuffer(e.getActionCommand());
                    pushButtotn = "";
                    break;
                default:
                    if(pushButtotn.equals("")){
                        pushButtotn += e.getActionCommand();
                        jTextArea.setText(jTextArea.getText() + "\n" + pushButtotn);
                    }else{
                        pushButtotn += e.getActionCommand();
                        jTextArea.setText(jTextArea.getText()  + e.getActionCommand());
                    }


            }
        }
    }

}