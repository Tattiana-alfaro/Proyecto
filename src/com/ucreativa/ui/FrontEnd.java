package com.ucreativa.ui;

import javax.swing.*;
import java.awt.*;

public class FrontEnd extends JFrame {

    private String[] listaCambios = { "Agregar", "Remover", "Modificar" ,"Incapacidad" };

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
        super.getContentPane().add(componente,BorderLayout.PAGE_START);
    }

    private void crearComponentes(){
        // Crear Labels
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblSalario = new JLabel("Salario");
        JLabel lblCambio = new JLabel("Cambio");
        JLabel lblComentario = new JLabel("Comentario");

        // Crear Textos
        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtSalario = new JTextField();
        JComboBox cbxCambio = new JComboBox(listaCambios);
        JTextArea txtComentario = new JTextArea();

        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblSalario);
        this.agregarComponente(txtSalario);
        this.agregarComponente(lblCambio);
        this.agregarComponente(cbxCambio);
        this.agregarComponente(lblComentario);
        this.agregarComponente(txtComentario);
        };

}
