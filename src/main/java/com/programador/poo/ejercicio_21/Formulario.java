/*
 
 */
package com.programador.poo.ejercicio_21;

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
import com.programador.poo.utils.ValidateNumbers;

/**
 *
 * @author Federico Mamoris
 */
public class Formulario extends JFrame implements ActionListener {

    private String titulo;
    private JPanel panelCentral;

    private JPanel panelEtiqueta1;
    private JTextField valor1;
    private JPanel panelEtiqueta2;
    private JTextField valor2;
    private JPanel panelButton;
    private JButton resultButtonResta;
    private JButton resultButtonSuma;
    private JPanel panelResultadoSuma;
    private JPanel panelResultadoResta;
    private JTextField resultado;

    public Formulario(String titulo) {
        this.titulo = titulo;
    }

    public void crearFormulario() {
        setLayout(new GridLayout(3, 1));
        

        panelCentral = new JPanel();

        panelEtiqueta1 = new JPanel();
        valor1 = new JTextField();
        valor1.setPreferredSize(new Dimension(100, 25));
        panelEtiqueta2 = new JPanel();
        valor2 = new JTextField();
        valor2.setPreferredSize(new Dimension(100, 25));
        panelButton = new JPanel();
        resultButtonSuma = new JButton("Sumar");
        resultButtonSuma.addActionListener(this);
        panelResultadoSuma = new JPanel();
        resultButtonResta = new JButton("Restar");
        resultButtonResta.addActionListener(this);
        panelResultadoSuma = new JPanel();
        panelResultadoResta = new JPanel();
        resultado = new JTextField();
        resultado.setPreferredSize(new Dimension(100, 25));

        panelEtiqueta1.add(new JLabel("Valor 1: "));
        panelEtiqueta1.add(valor1);
        panelEtiqueta2.add(new JLabel("Valor 2: "));
        panelEtiqueta2.add(valor2);
        panelButton.add(resultButtonSuma);
        panelButton.add(resultButtonResta);
        panelResultadoResta.add(new JLabel("Resultado: "));
        panelResultadoResta.add(resultado);

        panelCentral.add(panelEtiqueta1);
        panelCentral.add(panelEtiqueta2);
        panelCentral.add(panelButton);
        panelCentral.add(panelResultadoSuma);
        panelCentral.add(panelResultadoResta);

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

        if (e.getSource() == resultButtonSuma) {
            if (valor1.getText().matches("-?[1-9]\\d*|0") && valor1.getText().matches("-?[1-9]\\d*|0")) {
                resultado.setText(Integer.toString(Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText())));
            } else {

                JOptionPane.showMessageDialog(null,
                        "Al menos uno de los valores ingresados no es un número",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == resultButtonResta) {
            {
                if (valor1.getText().matches("-?[1-9]\\d*|0") && valor1.getText().matches("-?[1-9]\\d*|0")) {

                    resultado.setText(Integer.toString(Integer.parseInt(valor1.getText()) - Integer.parseInt(valor2.getText())));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Al menos uno de los valores ingresados no es un número",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                }

            }
        }

    }
}
