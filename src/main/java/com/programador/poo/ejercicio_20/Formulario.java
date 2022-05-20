/*
 
 */
package com.programador.poo.ejercicio_20;

import java.awt.Dimension;
import java.awt.GridLayout;
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
 * @author Federico Mamoris
 */
public class Formulario extends JFrame implements ActionListener {

    private String titulo;
    private JPanel panelCentral;
    private JLabel etiquetaCentrada;
    private JTextField text;
    private JButton buttonMsg;

    public Formulario(String titulo) {
        this.titulo = titulo;
    }

    public void crearFormulario() {
        setLayout(new GridLayout(1, 3));
        JPanel panelCentral = new JPanel();
        panelCentral.add(new JLabel("Ingrese nombre"));
        text = new JTextField();
        text.setPreferredSize(new Dimension(100, 25));

        panelCentral.add(text);
        buttonMsg = new JButton("Saludar");
        buttonMsg.addActionListener(this);
        panelCentral.add(buttonMsg);
        add(panelCentral);
        setTitle(this.titulo);
        /*setBounds(50, 50, 450, 400);*/
        setSize(450, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        //setLayout(null);
        //setForeground(Color.white); // Establecer el color de JLabel
        setVisible(true); // es la forma visible
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener

        if (e.getSource() == buttonMsg && !text.getText().isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Hola " + text.getText(), "Bienvenido", JOptionPane.NO_OPTION);

        } else {
            JOptionPane.showMessageDialog(null,
                    "Error debe ingresar al menos un caracter",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);

        }

    }
}
