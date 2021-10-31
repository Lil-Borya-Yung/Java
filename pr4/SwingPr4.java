import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingPr4 {
    private int mad, mil;
    private String lasts = "N/A", wins = "DRAW";
    private JButton milan, rm;
    private JLabel res, last, win;
    SwingPr4() {
        JFrame ftbl = new JFrame("TAB");
        ftbl.setSize(400, 400);
        ftbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        milan = new JButton("AC Milan");
        rm = new JButton("Real Madrid");
        int mad = 0, mil = 0;
        res = new JLabel();
        last = new JLabel("Last Scorer: N/A");
        win = new JLabel();
        upd();
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change(milan);
            }
        });
        rm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change(rm);
            }
        });
        ftbl.add(milan, BorderLayout.EAST);
        ftbl.add(rm, BorderLayout.WEST);
        ftbl.add(res, BorderLayout.CENTER);
        ftbl.add(last, BorderLayout.SOUTH);
        ftbl.add(win, BorderLayout.NORTH);
        ftbl.setVisible(true);
    }
        void change(JButton button) {
            if (button.getText().equals("AC Milan")) {
                mil+=1;
            }
            if (button.getText().equals("Real Madrid")) {
                mad +=1;
            }
            lasts = button.getText();
            if (mil > mad) {
                wins = "AC Milan";
            } else if (mad > mil) {
                wins = "Real Madrid";
            } else {
                wins = "DRAW";
            }
            upd();
        }
        void upd() {
            res.setText("Result: "+mil+" X "+ mad);
            last.setText("Last Scorer: "+lasts);
            win.setText("Winner: "+wins);
        }
    }
