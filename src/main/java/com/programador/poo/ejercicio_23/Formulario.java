/*
 
 */
package com.programador.poo.ejercicio_23;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Federico Mamoris
 */
public class Formulario extends JFrame implements ItemListener, ActionListener {

    private String titulo;

    private JPanel panelComboBox;
    private JPanel panelButton;
    private JPanel panelResultado;
    private JButton button;
    private JLabel label;
    private JComboBox comboBox;
    private JLabel resultado;
    HashMap<String, Color> map = new HashMap<String, Color>();

    public Formulario(String titulo) {
        this.titulo = titulo;
    }

    public void crearFormulario() {
        setLayout(new GridLayout(3, 1));

        panelButton = new JPanel();
        panelComboBox = new JPanel();
        panelResultado = new JPanel();
        button = new JButton("Cambiar");
        button.addActionListener(this);
        label = new JLabel("Seleccionar Color");
        comboBox = new JComboBox<>();
        comboBox.addItem("Magenta");
        comboBox.addItem("Verde");
        comboBox.addItem("Azul");
        comboBox.addItem("Gris");
        comboBox.addItem("Rosa");
        comboBox.addItem("Amarillo");
        comboBox.addItem("Naranja");
        comboBox.addItem("Negro");
        comboBox.addItemListener(this);
        resultado = new JLabel();

        panelComboBox.add(label);

        panelComboBox.add(comboBox);
        panelComboBox.setAlignmentX(CENTER_ALIGNMENT);
        panelComboBox.setAlignmentY(CENTER_ALIGNMENT);
        panelResultado.add(resultado);
        panelResultado.setAlignmentX(CENTER_ALIGNMENT);
        panelResultado.setAlignmentY(CENTER_ALIGNMENT);
        panelButton.add(button);
        panelButton.setAlignmentX(CENTER_ALIGNMENT);
        panelButton.setAlignmentY(CENTER_ALIGNMENT);
        add(panelComboBox);
        add(panelResultado);
        add(panelButton);

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
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox) {
            setTitulo(comboBox.getSelectedItem().toString());
            resultado.setText(comboBox.getSelectedItem().toString());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
        map.put("Magenta", Color.RED);
        map.put("Verde", Color.GREEN);
        map.put("Azul", Color.BLUE);
        map.put("Gris", Color.GRAY);
        map.put("Rosa", Color.PINK);
        map.put("Amarillo", Color.YELLOW);
        map.put("Naranja", Color.ORANGE);
        map.put("Negro", Color.BLACK);

        if (e.getSource() == button) {

            panelResultado.setBackground(map.get(comboBox.getSelectedItem().toString()));
            panelButton.setBackground(map.get(comboBox.getSelectedItem().toString()));
            panelComboBox.setBackground(map.get(comboBox.getSelectedItem().toString()));
            this.getContentPane().setBackground(map.get(comboBox.getSelectedItem().toString()));
        }

    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String nuevoTitulo) {
        this.setTitle(nuevoTitulo);
    }
}
