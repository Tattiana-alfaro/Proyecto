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
        super.setBounds(100, 100, 730, 489);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(6, 2));
    }

    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
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

        JButton btnSalvar = new JButton("Salvar");
        JButton btnReporte = new JButton("Reporte");


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
        this.agregarComponente(btnSalvar);
        this.agregarComponente(btnReporte);
        };

}
