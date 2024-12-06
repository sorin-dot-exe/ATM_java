
package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private double total = 1000;
    public Main() {
        
        
        
        JPanel panou = new JPanel();
        add(panou);
        panou.setVisible(true);
        panou.setSize(400, 400);
        
        
        JButton sold = new JButton("Sold");
        JButton depune = new JButton("Depunere");
        JButton retrage = new JButton("Retragere");
        
        panou.add(sold);
        panou.add(depune);
        panou.add(retrage);
        
        sold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sold = total;
                JOptionPane.showMessageDialog(null, "Total sold: " + sold + " RON");
                }
        });
        
        
        depune.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Depunere bani: ");
                double extra = Double.parseDouble(input);
                total += extra;
                
                JOptionPane.showMessageDialog(null, "S-au adaugat " + extra + " RON");
                }
        });
        
            
        retrage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input2 = JOptionPane.showInputDialog("Retragere bani: ");
                double retrage = Double.parseDouble(input2);
                if(retrage<total) {
                    total-= retrage;
                    JOptionPane.showMessageDialog(null, "S-au retras " + retrage + " Ron");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Fonduri insuficiente pentru retragere!");
                }
            }
        });
    }
}
