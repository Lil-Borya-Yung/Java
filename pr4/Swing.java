import javax.swing.*;

public class Swing {
    Swing(){
        JFrame jfrm = new JFrame("NEW FRAME");
        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("I'm jLabel");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Swing();
            }
        });
    }
}
