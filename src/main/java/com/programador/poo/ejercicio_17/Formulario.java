/*
 
 */
package com.programador.poo.ejercicio_17;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Federico Mamoris
 */
public class Formulario extends JFrame implements ActionListener {

    private String titulo;
    private JPanel panelCentral;
    private JPanel panelEjercicio17;
    private JPanel panelEjercicio18;
    private JPanel panelEjercicio19;
    private JLabel etiquetaCentrada;
    private JLabel etiquetaBotones;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel buttonSelected;

    public Formulario(String titulo) {
        this.titulo = titulo;
    }

    public void crearFormulario() {

        setLayout(new GridLayout(3, 1));
        JPanel panelCentral = new JPanel();
        JPanel panelEjercicio17 = new JPanel();
        JPanel panelEjercicio18 = new JPanel();
        JPanel panelEjercicio19 = new JPanel();

        panelEjercicio17.add(new JLabel("Ejercicio 17 - No se puede modificar el tamaño"));

        panelEjercicio18.add(new JLabel("Ejercicio 18"));
        etiquetaCentrada = new JLabel("Etiqueta centrada");
        panelEjercicio18.add(etiquetaCentrada);

        buttonSelected = new JLabel("Seleccion");
        button1 = new JButton("Boton 1");
        button1.addActionListener(this);
        button2 = new JButton("Boton 2");
        button2.addActionListener(this);
        button3 = new JButton("Boton 3");
        button3.addActionListener(this);
        panelEjercicio19.add(button1);
        panelEjercicio19.add(button2);
        panelEjercicio19.add(button3);
        panelEjercicio19.add(buttonSelected);

        panelCentral.add(panelEjercicio17);
        panelCentral.add(panelEjercicio18);
        panelCentral.add(panelEjercicio19);
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

        if (e.getSource() == button1) {
            buttonSelected.setText("Boton número 1");
        } else if (e.getSource() == button2) {
            buttonSelected.setText("Boton número 2");
        } else {
            buttonSelected.setText("Boton número 1");
        }
    }
}
