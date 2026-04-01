/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omen_Gamer
 */

import javax.swing.*;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;

public class VentanaJTattoo extends JFrame {

    public VentanaJTattoo() {
        super("Ventana con JTattoo");

        try {
            // Aplicamos JTattoo SOLO a esta ventana
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Creamos 5 componentes
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField campoTexto = new JTextField(15);
        JButton boton = new JButton("Aceptar");
        JCheckBox check = new JCheckBox("Recordar");
        JComboBox<String> combo = new JComboBox<>(new String[]{"Opción 1", "Opción 2", "Opción 3"});

        // Panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        panel.add(check);
        panel.add(combo);

        // Configuración de la ventana
        add(panel);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaJTattoo();
    }
}