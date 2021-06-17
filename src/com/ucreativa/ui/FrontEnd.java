package com.ucreativa.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5, 2));
    }
    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }

    private void crearComponentes(){
        // Crear Labels
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblSalario = new JLabel("Salario");

        // Crear Textos
        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtSalario = new JTextField();

        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblSalario);
        this.agregarComponente(txtSalario);
        };

}
