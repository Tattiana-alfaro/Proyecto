package com.ucreativa.ui;

import com.ucreativa.repositories.FileRepository;
import com.ucreativa.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    private String[] listaCambios = { "Agregar", "Remover", "Modificar" ,"Incapacidad" };
    BitacoraService service = new BitacoraService(new FileRepository());

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
        super.setSize(375, 175);
        super.setLayout(new GridLayout(6, 2));
    }

    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }

    private void crearComponentes(){
        // Crear Labels
        JLabel lblNombre = new JLabel("*Nombre");
        JLabel lblCedula = new JLabel("*Cedula");
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
        btnSalvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String test = txtNombre.getText();

                String actionValue = cbxCambio.getSelectedItem().toString();
                if (!(txtNombre.getText().equals("") || txtCedula.getText().equals(""))) {
                    try {
                        service.save(txtNombre.getText(),
                                txtCedula.getText(),
                                txtSalario.getText(),
                                actionValue,
                                txtComentario.getText());
                        String reporte = String.join("\n", service.get());
                        JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
                    } catch (ErrorSalarioException error) {
                        JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(),
                                error.getMessage());
                    }
                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtComentario.setText("");
                    cbxCambio.setSelectedItem(0);
                }
                else {
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), "Por favor complete los datos de los campos requeridos.");
                }
            }
        });

        JButton btnReporte = new JButton("Reporte");
        btnReporte.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String reporte = String.join("\n", service.get());
                JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
            }
        });

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
