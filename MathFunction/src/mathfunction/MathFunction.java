/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunction;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CrowdStar
 */
public class MathFunction extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JLabel answerLabel;
    JButton button;
    JTextField problemField;

    public MathFunction() {
        problemField = new JTextField();
        problemField.setToolTipText("Enter math problem here");

        answerLabel = new JLabel();

        button = new JButton("Solve");
        button.addActionListener(this);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(problemField, BorderLayout.NORTH);
        mainPanel.add(answerLabel, BorderLayout.CENTER);
        mainPanel.add(button, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new MathFunction();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (isCanSolve(problemField.getText())) {
                // logic for solving the problem goes here. 
            } else {
                JOptionPane.showMessageDialog(null, "Can not solve the problem yet");
            }
        }
    }

    public boolean isCanSolve(String problem) {
        // your logic goes here. Ability to check if your library can be able to solve a problem or not
        //returns true if it can or false if it can not
        return false;
    }

}
