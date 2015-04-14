/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author oquintansocampo
 */
public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;

    public Ventana() {
        marco = new JFrame(" Evento 1");
        panel = new JPanel();
        boton = new JButton(" Pulsar ");
        etiqueta = new JLabel();
        boton.addActionListener(this);
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);

        marco.setSize(150, 100);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
            etiqueta.setText("Boton pulsado");
        }
    }

}
